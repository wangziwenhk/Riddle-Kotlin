# Object Manager的使用方法

## 获取对象
获取当前作用域中的对象可以通过使用 getObject 方法,
该方法传入一个 String 类型的 name,并最终返回该名称所对应的对象

## 定义对象
定义一个对象可以通过使用 defineObject 方法,
该方法传入两个 String 类型的 name 和 type 和一个 Any 类型的 value \
当对象被定义后会有一个唯一的 uuid,该方法会返回该 uuid,以便直接访问该对象

## 设置对象的值
设置当前作用域中对象的值可以使用 setValue 方法,
该方法