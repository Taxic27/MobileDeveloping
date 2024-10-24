package com.example.mobiledeveloping.Lab1.Task2

fun main(){
    println("Введите номер месяца (1-12):")
    val month = readLine()?.toIntOrNull()

    val season = when(month) {
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        12, 1, 2 -> "Зима"
        else -> "Введен некорректный номер месяца"
    }
    println(season)
}