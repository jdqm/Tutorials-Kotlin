package com.jdqm.kotlin.types.classes

class Person(age: Int, name: String) {
    var age: Int = age //property
        get() {
            return field
        }
        set(value) {
            println("setAge: $value")
            field = value
        }
    var name: String = name
        get() {
            return field // backing field
        }
        set(value) {
            field = value
        }
}

fun main() {
    val ageRef = Person::age
    val person = Person(18, "Kotlin")
    val nameRef = person::name
    ageRef.set(person, 20)
    nameRef.set("Java")
}