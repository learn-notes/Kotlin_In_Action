package com.joh.kt.ch02

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

/**
 * try...catch
 */
fun main() {

    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
    val readerNo = BufferedReader(StringReader("not a number"))
    println(readNumber(readerNo))

    println(readNumber2(readerNo))
}

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } /*finally {
        reader.close()
    }*/
}

fun readNumber2(reader: BufferedReader) = try {
    Integer.parseInt(reader.readLine())
} catch (e: NumberFormatException) {
    null
}