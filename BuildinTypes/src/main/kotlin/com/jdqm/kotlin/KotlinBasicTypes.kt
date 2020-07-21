package com.jdqm.kotlin

/**
 * Created By Jdqm on 2020/7/2
 */
fun main() {
    val a: Int = 2
    val b: String = "Hello Kotlin"

    //val c = 123456l //compile error
    val c = 123456L //Ok

    val d = 3.0 // Double, 3.0f Float

    val e: Int = 10
//    val f: Long = e //implicitness no allowed
    val f: Float = e.toFloat()

    val float1: Float = 1f
    val double1: Double = 1.0

    //Unsigned types

    val g: UInt = 10u
    val h: ULong = 10000000000u
    val i: UByte = 1u

    println("Range of Int: ${Int.MIN_VALUE}, ${Int.MAX_VALUE}")
    println("Range of UInt: ${UInt.MIN_VALUE}, ${UInt.MAX_VALUE}")

    val j = "I❤️China"
    println("Value of String 'j' is: $j") //no need brackets
    println("Length of String 'j' is: ${j.length}") //need brackets
    System.out.printf("Length of String 'j' is: %d", j.length)

    val k = "Today is a sunny day."
    val m = String("Today is a sunny day.".toCharArray())
    println(k === m) // compare references.
    println(k == m) // compare values.

    val n = """
                <!doctype html>
                <html>
                <head>
                    <meta charset="UTF-8"/>
                    <title>Hello World</title>
                </head>
                <body>
                    <div id="container">
                        <H1>Hello World</H1>
                        <p>This is a demo page.</p>
                    </div>
                </body>
                </html>
                """.trimIndent()

    println(n)
}