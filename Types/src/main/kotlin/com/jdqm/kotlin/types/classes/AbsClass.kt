package com.jdqm.kotlin.types.classes

abstract class AbsClass {
    abstract fun absMethod()
    open fun overridable(){} //默认不可以被复写，需要加open
    fun nonOverridable(){}
}