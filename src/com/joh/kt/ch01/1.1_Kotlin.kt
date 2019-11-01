package com.joh.kt.ch01

/**
 * Kotlin初体验
 */

// Int? 表示为可为空；=null 表示默认值为0
data class Person(
    val name: String,
    val age: Int? = null
)

fun main() {
    val persons = listOf(
        // 创建Person对象，以下的方式都可以
        Person("A"),
        Person("B", 12),
        Person(name = "C", age = 20)
    )
    println(persons)

    // maxBy函数用于查找列表中最大的值
    // ?: 运算符，表示若值为null返回0
    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}