package com.example.mobiledeveloping.Lab1.Task1

fun main() {
    println("Введите первое число:")
    val firstNumber = readLine()?.toIntOrNull() ?: return
    println("Введите второе число:")
    val secondNumber = readLine()?.toIntOrNull() ?: return
    println("Введите третье число:")
    val thirdNumber = readLine()?.toIntOrNull() ?: return

    val modifiedFirst = firstNumber * 2
    val modifiedSecond = secondNumber - 3
    val modifiedThird = thirdNumber * thirdNumber

    val sum = modifiedFirst + modifiedSecond + modifiedThird
    println("Сумма чисел - $sum")

}