package com.joh.kt.ch04

/**
 * 通过setter与getter访问
 */

// 这里对默认get和set做了一个更改，添加输出日志的代码
class Student(val name: String) {
    var address: String = "默认地址"
        get() {
            println("address=$field")
//            field = "$field L"
            return field
        }
        set(value: String) {
            println("old address=$field, new address=$value")
            field = value
        }
}

fun Student.toJsonStr() = "( $name, $address )"

fun main() {
    var stu = Student("小米")
    println(stu.toJsonStr())
    stu.address="香港"
    println(stu.toJsonStr())
}