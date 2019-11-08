package com.joh.kt.ch05

import javax.swing.text.View

/**
 * Lambda表达式
 */

data class Person(val name: String, val age: Int)

fun main() {
    val ps = listOf(Person("AA", 10), Person("BB", 20))

    // 用Lambda搜索
    println(ps.maxBy({ it: Person -> it.age })) //未简化
    println(ps.maxBy { it.age }) //简化后
    // 用成员变量搜索
    println(ps.maxBy(Person::age))

    println(sum(1,2))

}

val sum = {x:Int,y:Int->
    print("sum of x + y = ")
    x+y
}