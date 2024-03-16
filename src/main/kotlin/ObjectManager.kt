package main.kotlin

import gen.RiddleParser
import main.error.ClassNotExist
import main.error.DuplicateElementException
import main.error.ImmutableVariableException
import main.error.ModuleNotImplemented
import java.util.*

class ObjectManager {
    companion object {
        //获取某一标识符所对应对象的UUID
        private var uuids = HashMap<String, Stack<Int>>()

        //获取某一UUID所对应对象
        private var objects = HashMap<Int, Object>()

        //当前作用域中定义的对象
        private var newDefined = Stack<ArrayList<String>>()

        //函数表(类名,方法名,是否静态,参数列表)
        private var methods =
            HashMap<String, HashMap<String, HashMap<Boolean, HashMap<ArrayList<String>, RiddleParser.FuncBodyContext>>>>()

        private var SystemMethods =
            HashMap<String, HashMap<String, HashMap<Boolean, HashMap<ArrayList<String>,()->Unit>>>>()

        fun toObject(value: Any,name:String="UNKNOWN",stableType:Boolean=false,isConst: Boolean=false):Object{
            val theObject = Object()
            theObject.name = name
            theObject.type = value::class.simpleName.toString()
            theObject.value = value
            theObject.stableType = stableType
            theObject.isConst = isConst
            return theObject
        }

        fun getObject(name: String): Object {
            if (uuids[name].isNullOrEmpty()) {
                throw NoSuchElementException("The object \"$name\" does not exist")
            }
            return objects[uuids[name]!!.peek()]!!
        }

        fun getObject(uuid: Int): Object {
            if (!objects.containsKey(uuid)) throw NoSuchElementException("The object \"$uuid\" does not exist")
            return objects[uuid]!!
        }

        fun defineObject(name: String, type: String = "UnKnow", value: Any = Void(), isConst: Boolean = false): Int {
            if (newDefined.peek().contains(name)) {
                throw DuplicateElementException("The Identifier \"$name\" does defined")
            }
            val temp = Object()
            temp.name = name
            temp.type = type
            temp.value = value
            temp.isConst = isConst
            val uuid = temp.hashCode()

            if (!uuids.containsKey(name)) uuids[name] = Stack<Int>()
            uuids[name]!!.push(uuid)
            objects[uuid] = temp
            newDefined.peek().add(name)
            return uuid
        }

        fun inSpace() {
            newDefined.push(ArrayList<String>())
        }

        fun outSpace() {
            for (element in newDefined.peek()) {
                objects.remove(uuids[element]!!.peek())
                uuids[element]!!.pop()
                if (uuids[element]!!.isEmpty()) {
                    uuids.remove(element)
                }
            }
            newDefined.pop()
        }

        fun printAllObject() {
            for (element in objects) {
                println(
                    arrayListOf(
                        element.key,
                        element.value.name,
                        element.value.type,
                        element.value.value,
                        element.value.isConst
                    )
                )
            }
        }

        fun setValue(name: String, value: Any) {
            val uuid = uuids[name]!!.peek()
            val theObject = { objects[uuid]!! }

            //当类型是未知时说明该变量从来没有赋值过值，所以不管是const的都可以赋值
            if (theObject().type == "UnKnow") {
                theObject().type = value::class.simpleName.toString()
                theObject().value = value
            } else if (!theObject().isConst) {
                if (theObject().stableType) {
                    if (value::class.simpleName.toString() == theObject().type) {
                        theObject().value = value
                    } else throw TypeCastException("Type mismatch")
                } else {
                    theObject().type = value::class.simpleName.toString()
                    theObject().value = value
                }
            } else throw ImmutableVariableException("This variable is immutable")
        }


        //运行方法(类名称会自动判断)(对象生成需要在函数外定义)
        fun runMethod(self: Object, funcName: String, parameterList: ArrayList<Object> = ArrayList()): Any {
            val className = self.type
            val typeList = ArrayList<String>()
            for (element in parameterList) {
                typeList.add(element.type)
            }
            if (!methods.containsKey(className)) {
                throw ClassNotExist("Class's methods \"$className\" does not exist")
            } else if (!methods[className]!!.containsKey(funcName) ||
                !methods[className]!![funcName]!![false]!!.containsKey(typeList)
            ) {
                var message = "Method \"$className.$funcName(\""
                for (element in typeList) message += "$element,"
                message += ") not implemented"
                throw ModuleNotImplemented(message)
            }
            val funcBody = methods[className]!![funcName]!![false]!![typeList]
            //进入作用域
            this.inSpace()
            //传入参数
            for (element in parameterList) {
                val uuid = this.defineObject(element.name, element.type, element.value, element.isConst)
                this.objects[uuid]!!.stableType = true
            }
            val result = TheVisitor.visit(funcBody)
            this.outSpace()
            return result
        }


        fun addMethod(
            className: String,
            funcName: String,
            typeList: ArrayList<String>,
            isStatic: Boolean,
            funcBody: RiddleParser.FuncBodyContext
        ) {
            if (!methods.containsKey(className)) methods[className] = HashMap()
            if (!methods[className]!!.containsKey(funcName)) methods[className]!![funcName] = HashMap()
            if (!methods[className]!![funcName]!!.containsKey(isStatic)) methods[className]!![funcName]!![isStatic] = HashMap()
            if(methods[className]!![funcName]!![isStatic]!!.containsKey(typeList))throw DuplicateElementException("This function is defined repeatedly")
            methods[className]!![funcName]!![isStatic]!![typeList] = funcBody
        }
    }
}