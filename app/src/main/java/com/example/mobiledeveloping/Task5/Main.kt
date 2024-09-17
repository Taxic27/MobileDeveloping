package com.example.mobiledeveloping.Task5

abstract class Figure {
    // Свойства
    abstract val area: Double
    abstract val perimeter: Double

    // Функция, которую наследуют дочерние классы
    abstract fun info()
}

class Rectangle(private val width: Double, private val height: Double) : Figure() {
    override val area: Double = width * height
    override val perimeter: Double = 2 * (width + height)

    override fun info() {
        println("--Прямоугольник--")
        println("Площадь: $area")
        println("Периметр: $perimeter")
    }
}

class Square(private val width: Double) : Figure() {
    override val area: Double = width * width
    override val perimeter: Double = width * 4

    override fun info() {
        println("--Квадрат--")
        println("Площадь: $area")
        println("Периметр: $perimeter")
    }
}

fun main() {
    val shapes: List<Figure> = listOf(
        Rectangle(2.0, 4.0),
        Square(5.3)
    )

    for (shape in shapes) {
        shape.info()
        println()
    }
}
