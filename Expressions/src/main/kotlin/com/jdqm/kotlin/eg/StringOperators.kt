package com.jdqm.kotlin.eg

import java.lang.IndexOutOfBoundsException

operator fun String.minus(right: Any?)
        = this.replaceFirst(right.toString(), "")

operator fun String.times(right: Int): String {
    return (1..right).joinToString(""){ this }
}

//operator fun String.get(index: Int): Char {
//    if (index < 0 || index > length - 1) {
//        throw IndexOutOfBoundsException()
//    }
//    return this[index]
//}

operator fun String.div(right: Any?): Int {
    val right = right.toString()
    return this.windowed(right.length, 1, transform = {
        it == right
    }) // [false, false, false, false ... false, true, ..., true]
        .count { it }
}

fun main() {
    val value = "HelloWorld" + "World"
    value[1]

    println(value - "World")
    println(value * 2)

    val star = "*"
    println("*" * 20)

    println(value / 3)
    println(value / "l")
    println(value / "ld")

}



