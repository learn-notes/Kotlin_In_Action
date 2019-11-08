package com.joh.kt.ch04

/**
 * 数据类
 */

class Client(private val name: String, private val postalCode: Int) {
    // 重写toString
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main() {
    val c = Client("小华", 313000)
    println(c.toString())
}