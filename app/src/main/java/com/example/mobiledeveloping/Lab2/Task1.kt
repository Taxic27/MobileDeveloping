package com.example.mobiledeveloping.Lab2


fun task1(number: Int): Int {
    return if (number in 10..99) {
        number
    } else {
        0
    }
}