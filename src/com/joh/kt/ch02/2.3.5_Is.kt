package com.joh.kt.ch02

/**
 * 类型转换与检查
 */

interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

// is 关键字用于检查变量类型；
fun eval(e: Expr): Int {
    if (e is Num) {
        return e.value
    } else if (e is Sum) {
        return eval(e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }
}

// 等价于上面的函数
fun eval2(e: Expr) =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval(e.right) + eval(e.left)
    } else {
        IllegalArgumentException("Unknown expression")
    }

fun eval3(e: Expr) =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> IllegalArgumentException("Unknown expression")
    }