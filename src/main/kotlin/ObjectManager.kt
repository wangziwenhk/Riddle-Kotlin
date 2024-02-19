package main.kotlin

import java.util.*

class ObjectManager {
    companion object {
        //获取某一标识符所对应对象的UUID
        private var uuids = HashMap<String, Stack<Int>>()

        //获取某一UUID所对应对象
        private var objects = HashMap<Int, Object>()

        //当前作用域中定义的对象
        private var newDefined = Stack<ArrayList<String>>()
        fun getObject(name: String): Object {
            if (uuids[name].isNullOrEmpty()) {
                throw NoSuchElementException("The object \"$name\" does not exist")
            }
            return objects[uuids[name]!!.peek()]!!
        }

        fun defineObject(name: String, type: String = "UnKnow", value: Any = 0, isConst: Boolean = false) {
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
                    }
                    else throw TypeCastException("Type mismatch")
                } else {
                    theObject().type = value::class.simpleName.toString()
                    theObject().value = value
                }
            }
            else throw ImmutableVariableException("This variable is immutable")
        }
    }
}