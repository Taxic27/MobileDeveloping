package com.example.mobiledeveloping.Lab1.Task3

fun main(){
    println("Введите кол-во строк")
    val count = readLine()?.toIntOrNull()

    if (count != null && count>0){
        for (i in 1..count){
            println("*".repeat(i))
        }
    }
    else{
        println("Введите корректное положительное число")
    }

}