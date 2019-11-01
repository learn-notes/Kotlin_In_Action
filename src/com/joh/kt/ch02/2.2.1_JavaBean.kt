package com.joh.kt.ch02

// Kotlin中javaBean类
class Person(val name: String)

class Person2(
    val name: String,
    val isMarried: Boolean? = false
)

/**
 * 在bean类中自定义属性访问器
 */
class React(val h: Int, val w: Int) {
    val isSqueal: Boolean
        get() = h == w
}

fun main() {
    val person = Person("A")
    // 属性引用，与java不同，不需要使用get和set
    println(person.name)
    
    val react = React(100,100)
    println("这个矩形是正方式：${react.isSqueal}")
}