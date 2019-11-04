package com.joh.kt.ch02

import java.lang.Character.isLetter
import java.util.*

/**
 * Kotlin中 Map
 */

val mapData = TreeMap<Char, String>()

fun main() {
    for (c in 'A'..'G') {
        val binary = Integer.toBinaryString(c.toInt())
        mapData[c] = binary
    }

    for (a in mapData) {
        println(a)
    }
    println()
    /**
     * 下列两种方式表达意思相同，一般使用第一种更简便
     */
    println(mapData['A'])
    println(mapData.get('A'))
    println()

    val list = arrayListOf("10", "20", "30", "40")
    for (i in list) {
        print("$i ")
    }
    println()
    for ((index, element) in list.withIndex()) {
        println("$index: $element ")
    }
    println()

    println( 1 !in 1..5)
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}
