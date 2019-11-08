package com.joh.kt.ch06

/**
 * 可空类型
 */
fun main() {
    val x = null
    println(strLen(x))
    println(toUpper(x))
    println(strLen2(x))

    val s: String? = " "
//    println(s.isBlank())
//    println(s.isEmpty())
    println(s.isNullOrBlank()) //判断是否是null或者是空字符串或者是空白字符
    println(s.isNullOrEmpty()) // 判断是否是null或者是空字符串

//    val mList = listOf(1,2,'a',"Hello")

}

// 类型后加？标识这个类型是【可空类型】
fun strLen(s: String?): Int {
    return if (s != null) s.length else 0
}

// ?. 表示安全调用运算符
fun toUpper(s: String?) = s?.toUpperCase()

// ?: 表示Elvis运算符，当运算数为空时，返回自定义的默认值
fun strLen2(s: String?) = s ?: 0