package com.joh.kt.ch04

/**
 * 构造方法
 */
class User(val name: String, val age: Int? = null, val clazz: String? = null)

// User的拓展函数
fun User.toJsonStr() = "( $name, $age, $clazz )"


fun main() {
    val user1 = User("丽丽")
    val user2 = User("丽丽", clazz = "三年一班")
    val user3 = User("丽丽", 10, "三年一班")
    val user4 = User(name = "丽丽", age = 10, clazz = "三年一班")
    println(user1.toJsonStr())
    println(user2.toJsonStr())
    println(user3.toJsonStr())
    println(user4.toJsonStr())
}