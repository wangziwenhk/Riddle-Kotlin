package main.kotlin

class Object {
    var value = Any()
    var name : String = String()
    var type : String = String()
    var isConst : Boolean = false
    //是否确定类型会更改,暂时还没更新强类型变量，用不上
    // todo 更新强类型变量
    var stableType : Boolean = false
}