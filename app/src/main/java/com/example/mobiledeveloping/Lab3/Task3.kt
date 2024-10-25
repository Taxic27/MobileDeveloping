package com.example.mobiledeveloping.Lab3

import kotlin.math.sqrt

fun calculateSquareRoot(number: Double?): Double {
    return sqrt(number!!)
}

fun main(){
    try {
        println(calculateSquareRoot(144.0))
        println(calculateSquareRoot(null))
    }
    catch (e: NullPointerException){
        println("Число не может быть нулевым")
    }
}