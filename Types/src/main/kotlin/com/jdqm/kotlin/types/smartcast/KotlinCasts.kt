package com.jdqm.kotlin.types.smartcast

/**
 * Created By Jdqm on 2020/7/23
 */
fun main() {
    val kotliner: Kotliner = Person("Jdqm", 20)

    //判断了之，可以直接当做该类型使用，无需类型转换
    if (kotliner is Person) {
        println(kotliner.name)
    }
}