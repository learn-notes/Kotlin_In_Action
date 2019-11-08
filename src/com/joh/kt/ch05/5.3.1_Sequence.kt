package com.joh.kt.ch05

/**
 * 序列
 */

fun main() {
    val books = listOf(Book("图书1", listOf("作者1", "作者2")), Book("图书2", listOf("作者3")))
    println(books)

    //集合转换成序列
    val aList = books.asSequence()
        .map { it.title }
        .toList()
    println(aList)

    listOf(1, 2, 3, 4).asSequence()
        .filter { print("filter($it) ");it % 2 == 0 }
        .map { print("map($it) ");it * it }
        .toList()
    println()

    //序列创建的两种方式：
    // 1.集合上调用asSequence()，参考上面例子
    // 2.generateSequence函数
    val gs = generateSequence(3) { it + 1 }.takeWhile { it <= 10 }
    println(gs.toList())
    println(gs.sum())

}