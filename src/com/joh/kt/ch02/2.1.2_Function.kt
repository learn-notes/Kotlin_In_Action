package com.joh.kt.ch02

/**
 * Kotlin中函数、变量
 */

// fun关键字 用于声明一个函数
// Kotlin中函数可以定义在最外层
// 【a: Int, b: Int】表示参数列表
// 【: Int】 表示返回类型，无返回类型则不写
fun maxNum(a: Int, b: Int): Int {

    /**
     * Kotlin中 if...else 不是语句，而是表达式，所以不用写return
     */
    return if (a > b) a else b
}

// 表示含义和上面的写法相同
fun minNum(a: Int, b: Int) = if (a < b) a else b

// 代表Kotlin的主函数
fun main() {
    println(maxNum(10, 2))

    // val 表示不可变变量，类似java的final
    // var 表示可变变量
    val a = 10;
    var b = 20;
    println("a=$a, b=$b")
//    a=11;
    b = 22;
    println("a=$a, b=$b")

    // var 不可改变变量类型
//    var b = "String"

    val name = "xiaoming"
    println("Hello, $name")
//    println("Hello, $name你知道今天周几吗") 这样的引用写法不可行
    // 复杂的表达式引用，需要加{}
    println("Hello, ${name}你知道今天周几吗")
    println("Hello, ${name}我告诉你3+5=${3+5}")


}