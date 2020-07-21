package com.jdqm.kotlin

/**
 * Created By Jdqm on 2020/7/21
 *
 * Map的创建
 * 函数引用
 * 函数定义
 * Raw String
 * 字符串模板
 */
fun main(vararg args: String) {
    if (args.size < 3) {
        return showHelp()
    }

    val operator = mapOf<String, (Int, Int)->Int>(
        "+" to ::plus,
        "-" to ::minus,
        "*" to ::times,
        "/" to ::div
    )

    val opFunc = operator[args[1]]?: return showHelp()
    try {
        println("Input: ${args.joinToString(" ")}")
        println("Output: ${opFunc(args[0].toInt(), args[2].toInt())}")
    } catch (e: Exception) {
        println("Invalid Arguments.")
        showHelp()
    }
}

fun plus(arg0: Int, arg1: Int): Int{
    return arg0 + arg1
}

fun minus(arg0: Int, arg1: Int): Int{
    return arg0 - arg1
}

fun times(arg0: Int, arg1: Int): Int{
    return arg0 * arg1
}

fun div(arg0: Int, arg1: Int): Int{
    return arg0 / arg1
}


fun showHelp(){
    println("""
        Simple calculator:
        Input: 3 * 4
        Output: 12
    """.trimIndent())
}