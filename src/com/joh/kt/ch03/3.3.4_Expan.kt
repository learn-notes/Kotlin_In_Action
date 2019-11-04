package com.joh.kt.ch03

/**
 * 重写成员函数
 */
open class View {
    open fun onClick() = println("View Click")
}

class Button : View() {
    override fun onClick() = println("Button Click")
}

fun main() {
    val view = Button()
    view.onClick()
    view.showOff()

    println()

    val view2 :View = Button()
    view2.onClick()
    view2.showOff()
}

/**
 * 扩展函数
 */
fun View.showOff() = println("I am a View")

fun Button.showOff() = println("I am a Button")

val String.lastChar:Char
    get() = get(length-1)