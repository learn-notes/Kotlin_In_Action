package com.joh.kt.ch02

/**
 * Kotlin中when相当于Java的switch
 * 不过when不属于语句，而是表达式，存在返回值
 */
fun main() {
    println(getMoc(Color.Red))
    println(mix(Color.White, Color.Red))
    println(mix2(Color.White, Color.Red))
}

fun getMoc(color: Color) =
    when (color) {
        Color.Red -> "红色"
        Color.White, Color.Black -> "白色或黑色"
        else -> "其他颜色"
    }

// when与switch不同的是，他可以使用任意对象
fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.Red, Color.White) -> "红白色"
        setOf(Color.Black, Color.White) -> "黑白色"
        else -> "其他组合色"
    }

// 等价于上面的函数
fun mix2(c1: Color, c2: Color) =
    when {
        (c1 == Color.Red && c2 == Color.White) ||
                (c1 == Color.White && c2 == Color.Red) -> "红白色"
        (c1 == Color.Black && c2 == Color.White) ||
                (c1 == Color.White && c2 == Color.Black) -> "黑白色"
        else -> "其他组合色"
    }