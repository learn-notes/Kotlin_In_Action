package com.joh.kt.ch02

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

    for(a in mapData){
        println(a)
    }

}

