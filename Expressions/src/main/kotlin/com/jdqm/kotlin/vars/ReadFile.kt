package com.jdqm.kotlin.vars

import java.io.File

/**
 * Created By Jdqm on 2020/7/23
 */
fun main() {
    File("build.gradle").readText().toCharArray()
        .filterNot { it.isWhitespace() }
        .groupBy { it }
        .map { it.key to it.value.size }
        .forEach {
            print(it)
        }
}