package com.joh.kt.ch02

/**
 * 枚举
 */

// Kotlin中枚举声明需要 enum class 两个关键字
enum class Color {
    Red, White, Black
}

enum class Color2(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), WHITE(255, 255, 255), BLACK(0, 0, 0);

    // 若枚举中有定义方法，需要使用 ; 把常量列表与方法分隔开
    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    println(Color.Red)

    println(Color2.WHITE)
    println(Color2.BLACK.g)
    println(Color2.RED.rgb())
}