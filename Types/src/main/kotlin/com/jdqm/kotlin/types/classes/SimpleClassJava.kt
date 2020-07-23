package com.jdqm.kotlin.types.classes

open class SimpleClassJava(var x: Int, val y: String) : AbsClass(), SimpleInf {
    override val simpleProperty: Int
        get() {
            return 2
        }

    val z : Long
        get() {
            return simpleProperty * 2L
        }

    override fun absMethod() {}
    override fun simpleMethod() {}
    fun y(){}

    fun zzz(string: String){

    }

    final override fun overridable(){

    }
}

class SimpleClass2Java(x: Int, y: String): SimpleClassJava(x, y){

}