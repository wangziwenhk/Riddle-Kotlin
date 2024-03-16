# BasicType约定
在这个文档中将会讲解关于 Riddle 语言的所有基本类型的约定
## 运算符
在每一个语言中，运算符都是不可或缺的存在,在 Riddle 中，运算符的重载是通过以下方法来定义的
```
operator 操作符 (x:type,y:type,.....):type{
    (内部逻辑)
}
```
其中, x 和 y 不一定是指定的参数名称，也可以改为 left 和 right 等，但建议使用该名称以适配命名规范

目前可以被重载的操作符有:
```
下标 : (this)[x]
等于 : (this)=x
小于 : (this)<x
大于 : (this)>x
不等于 : (this)!=x
```

这些运算符重载操作都会记录在 this 对象的类型的方法表中，方法名称为对应的运算符，例如

```
class MyClass{
    var value:int
    operator > (self:object,x:int):bool{
        return self.value>x
    }
}

```
则可以重载 MyClass 的 `>` 运算符，则可以让 MyClass 的示例直接与 int 类型的示例比较