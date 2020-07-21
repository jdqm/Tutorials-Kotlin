package com.jdqm.kotlin

/**
 * Created By Jdqm on 2020/7/2
 */
fun main() {
    val a = IntArray(5)
    println(a.size) // 數組和集合保持統一用size，Java用length

    val b = ArrayList<String>()
    println(b.size)

    val c = intArrayOf(1, 2, 3, 4, 5)

    val d = arrayOf("Hello", "World")
    d[1] = "Kotlin"
    println("${d[0]}, ${d[1]}")

    val e = floatArrayOf(1f, 3f, 5f, 7f)
    for (element in e) {
        println(element)
    }
    e.forEach{
        println(it)
    }

    if (1f in e) {
        println("1f exists in variable 'e'")
    }

    if (1.2f !in e) {
        println("1.2f not exists in variable 'e'")
    }
}