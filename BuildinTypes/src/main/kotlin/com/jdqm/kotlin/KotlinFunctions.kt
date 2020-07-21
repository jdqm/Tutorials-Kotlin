package com.jdqm.kotlin

/**
 * Created By Jdqm on 2020/7/21
 */
fun main(vararg args: String) {
    println(args.contentToString())

    val x:Foo.(String, Long)->Any = Foo::bar
    val y: (Foo, String, Long)->Any = x
    val z: Function3<Foo, String, Long, Any> = y
    // (Foo, String, Long)->Any = Foo.(String, Long)->Any = Function3<Foo, String, Long, Any>

    yy(x)

    val f: ()->Unit = ::foo
    val g: (Int)->String = ::foo
    val h: (Foo, String, Long)->Any
            = Foo::bar

    multiParameters(1, 2, 3, 4)

    defaultParameter(y = "Hello")
    defaultParameter(10, 2)

    val (a, b, c) = multiReturnValues() //伪
    val r = a + b
    val r1 = a + c
    println(a)
    println(b)
    println(c)


    val intArray = intArrayOf(1, 2, 3, 4)
    printElement(intArray) {
        println(it)
    }
}

fun yy(p: (Foo, String, Long) -> Any){
    p(Foo(), "Hello", 3L)
}

class Foo {
    fun bar(p0: String, p1: Long): Any{
        println("$p0, $p1")
        return p0
    }
}

fun foo() { }
fun foo(p0: Int): String { TODO() }

fun defaultParameter(x: Int = 5, y: String, z: Long = 0L){
    TODO()
}

fun defaultParameter(x: Int, y: Long = 0L){
    TODO()
}

fun multiParameters(vararg ints: Int){
    println(ints.contentToString())
}

fun multiReturnValues(): Triple<Int, Long, Double> {
    return Triple(1, 3L, 4.0)
}

fun printElement(intArray: IntArray, action: (Int)->Unit) {
    for (i in intArray.indices) {
        action.invoke(intArray[i])
    }
}