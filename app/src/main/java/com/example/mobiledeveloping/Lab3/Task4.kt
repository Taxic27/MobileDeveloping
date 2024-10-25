package com.example.mobiledeveloping.Lab3

fun getStringLength(obj: Any?): Int{
    val string = obj as? String
    return string?.length ?: -1
}

fun main() {
    println(getStringLength("Привет"))
    println(getStringLength(666))
    println(getStringLength(null))
}