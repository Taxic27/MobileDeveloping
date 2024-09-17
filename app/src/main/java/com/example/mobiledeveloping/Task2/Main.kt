package com.example.mobiledeveloping.Task2

fun main(){
    println("Введите номер месяца (1-12):")
    val month = readLine()?.toIntOrNull()

    if(month != null){
        val season = if(month in 3..5){
            "Весна"
        } else if(month in 6..8){
            "Лето"
        } else if(month in 9..11){
            "Осень"
        } else if(month == 12 || month in 1..2){
            "Зима"
        } else{
            "Введен некорректный номер месяца"
        }
        println(season)
    }
    else{
        println("Введен некорректный номер месяца")
    }
}