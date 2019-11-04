package com.joh.kt.ch03

/**
 * 各种集合的使用
 */
fun main() {
    val strings = setOf("dd", "bb", "cc", "aa")
    println(strings)
    println("最小值: ${strings.min()}")
    println("最后一个值：${strings.last()}")
    println("第一个值：${strings.first()}")

    val lists = listOf("dd", "bb", "cc", "aa")
    println(lists)
    // 自定义输出的样式
    println(lists.joinToString(";","(",")"))
    println("最小值: ${lists.min()}")
    println("最后一个值：${lists.last()}")
    println("第一个值：${lists.first()}")

    val arrays = arrayListOf("dd", "bb", "cc", "aa")
    println(arrays)

}