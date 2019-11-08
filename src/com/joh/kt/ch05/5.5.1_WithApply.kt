package com.joh.kt.ch05

import java.lang.StringBuilder

/**
 * 带接受者的lambda: with\apply
 */
fun main() {
    println(alphabet())
    println(alphabet2())
    println(alphabetA())
}

/**
 * with函数
 */
fun alphabet(): String {
    val strBuilder = StringBuilder()
    return with(strBuilder) {
        for (c in 'A'..'Z') {
            this.append(c)
        }
        append("\n打印字母") //this可以去掉
        this.toString()
    }
}

// 简化上面的函数
fun alphabet2() = with(StringBuilder()) {
    for (c in 'A'..'Z') {
        append(c)
    }
    append("\n打印字母") //this可以去掉
    toString()
}

/**
 * apply函数
 */
fun alphabetA() = StringBuilder().apply {
    for (c in 'A'..'Z') {
        append(c)
    }
    append("\n打印字母")
}.toString()
