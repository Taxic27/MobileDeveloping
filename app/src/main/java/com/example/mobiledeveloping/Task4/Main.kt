package com.example.mobiledeveloping.Task4

fun main() {
    val numbers = doubleArrayOf(1.5, 3.2, -4.5, 0.0, 7.3, 2.1, 6.0)

    val max = numbers.max()
    val min = numbers.min()

    val difference = max-min
    println("Разность между максимальным и минимальным числом - $difference")
}