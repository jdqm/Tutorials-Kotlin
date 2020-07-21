package com.jdqm.kotlin

/**
 * Created By Jdqm on 2020/7/2
 */

fun main() {

    val intRange = 1..10
    val charRange = 'a'..'z'
    val longRange = 1L..100L

    val floatRange = 1f..2f //[1, 2]
    val doubleRange = 1.0 .. 2.0 //[1, 2]

    println(intRange.joinToString())
    println(floatRange.toString())

    //unsigned range
    val uintRange = 1U..10U
    val ulongRange = 10UL..100UL

    val intRangeWithStep = 1..10 step 2
    val charRangeWithStep = 'a'..'z' step 2
    val longRangeWithStep = 1L..100L step 5

    println(intRangeWithStep.joinToString())

    val intRangeReverse = 10 downTo 1
    val charRangeReverse = 'z' downTo 'a'
    val longRangeReverse = 100L downTo 1

    println(intRangeReverse.joinToString())

    //开区间
    val intRangeOpen = 1 until 10 //[1, 10)
    println(intRangeOpen.joinToString())

    for (element in intRange) {
        println(element)
    }

    intRange.forEach {
        println(it)
    }

    if (3.0 !in doubleRange) {
        println("3 in range 'intRange'")
    }

    if (12 !in intRange) {
        println("12 not in range 'intRange'")
    }

    val array = intArrayOf(1, 3, 5, 7)
    for (i in 0 until array.size) {
        print(array[i])
    }

    for (i in array.indices) {
        println(array[i])
    }
}
