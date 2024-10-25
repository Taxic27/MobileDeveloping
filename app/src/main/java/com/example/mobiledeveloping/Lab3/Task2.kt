package com.example.mobiledeveloping.Lab3

fun getFullName(firstName: String?, lastName: String?): String {
    val safeFirstName = firstName ?: "Unknown"
    val safeLastName = lastName ?: "Unknown"
    return "$safeFirstName $safeLastName"
}

fun main(){
    println(getFullName("Данила", "Городничев"))
    println(getFullName(null, "Городничев"))
    println(getFullName("Данила", null))
    println(getFullName(null, null))
}