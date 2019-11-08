package com.joh.kt.ch05

/**
 * 集合的函数式
 */
// 客户
data class Client(val name: String, val age: Int)

// 图书
data class Book(val title: String, val authors: List<String>)

fun main() {

    val list = listOf(1, 2, 3, 4)
    //println(list)
    val listC = listOf(Client("AA", 10), Client("BB", 35))
    //println(listC)

    // filter 筛选出符合判断式的元素,
    // filter的{}里必然是判断式
    //println(list.filter { it % 2 == 0 }) //[2, 4]
    //println(listC.filter { it.age > 20 }) //[Client(name=BB, age=35)]

    // map 执行给定函数并返回结果集合
    // map的{}里是需要执行的函数
    //println(list.map { it > 3 }) //[false, false, false, true]
    //println(list.map { it % 2 == 0 }) //[false, true, false, true]
    //println(list.map { it * 3 }) //[3, 6, 9, 12]

    //两种方式执行结果相同
    //println(listC.map { it.name }) //[AA, BB]
    //println(listC.map(Client::name)) //[AA, BB]

    // 联合执行
    //println(listC.filter { it.age > 20 }.map { it.name }) //[BB]
    // all、any、count、find、groupBy用法与上面类似

    /**
     * flatMap\flatten
     */
    val books = listOf(Book("图书1", listOf("作者1", "作者2")), Book("图书2", listOf("作者3")))
    println(books)
    println(books.map { it.authors }.toSet()) //[[作者1, 作者2], [作者3]]
    println(books.flatMap { it.authors }.toSet()) //[作者1, 作者2, 作者3]

}