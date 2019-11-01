package com.joh.kt.ch02

/**
 * Kotlin中的for循环
 */
fun main() {
    // 1..10 代表1到10的所有整数。 .. 是闭合区间
    val oneToTen = 1..10
    for (i in oneToTen) {
        print("$i ")
    }
    println()
    println(oneToTen)
    println()

    // until代表开区间，即不包含右侧末尾值；1 until 10 代表1到9的所有整数
    val oneToNine = 1 until 10
    for(i in oneToNine){
        print("$i ")
    }
    println()
    println(oneToNine)
    println()

    // downTo 代表递减数列,默认步长为1
    val downNum = 10 downTo 2
    for(i in downNum){
        print("$i ")
    }
    println()
    println(downNum)
    println()

    val step = 1..100 step 3
    for(i in step){
        print("$i ")
    }
    println()
    println(step)
    println()

}