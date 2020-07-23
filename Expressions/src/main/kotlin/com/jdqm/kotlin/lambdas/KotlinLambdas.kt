package com.jdqm.kotlin.lambdas

fun main() {
    val func: () -> Unit = fun() {
        println("Hello")
    }

    val lambda: () -> Unit = {
        println("Hello")
    }

    val f1 = { p: Int ->
        println(p)
        "Hello"
    }

    println(f1(1))


    IntArray(5) { it + 1 }
}