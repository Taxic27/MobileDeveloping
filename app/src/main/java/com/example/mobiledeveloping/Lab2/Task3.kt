package com.example.mobiledeveloping.Lab2

import kotlin.random.Random

fun printArray(array: IntArray) {
    for (element in array) {
        println(element)
    }
}

fun main() {
    println("Введите размерность массива N:")
    val n = readLine()?.toIntOrNull() ?: return
    val array = IntArray(n) { Random.nextInt(-100, 501) }
    println("Элементы массива:")
    printArray(array)

    val arrayTask1 = array.map(::task1).toIntArray()
    println("Преобразованный массив (task1):")
    printArray(arrayTask1)

    val arrayTask2 = array.filter(task2).toIntArray()
    println("Преобразованный массив (task2):")
    printArray(arrayTask2)

    val arrayTask2Task1 = array.filter(task2).map(::task1).toIntArray()
    println("Преобразованный и отфильтрованный массив (task2 -> task1):")
    printArray(arrayTask2Task1)
}