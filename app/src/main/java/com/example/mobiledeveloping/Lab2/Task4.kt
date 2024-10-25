package com.example.mobiledeveloping.Lab2

fun Array<Int>.filterAndMap(filter: (Int) -> Boolean, map: (Int) -> Int): IntArray {
    return this.filter(filter).map(map).toTypedArray().toIntArray()
}

fun main() {
    val array = arrayOf(10, 45, 60, -23, -200, 112, 101)

    val arrayTask2Task1 = array.filterAndMap(task2, ::task1)
    println("Преобразованный и отфильтрованный массив (task2 -> task1):")
    printArray(arrayTask2Task1)
}