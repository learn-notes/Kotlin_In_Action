package com.joh.kt.ch07

import javax.print.attribute.standard.MediaSize

/**
 * 重载
 */

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {
    val p1 = Point(10, 10)
    val p2 = Point(30, 40)
    println(p1 + p2) //使用 + 来调用plus方法
    // 等价于
    println(p1.plus(p2))


}