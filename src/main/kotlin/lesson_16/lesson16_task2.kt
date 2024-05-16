package lesson_16

import kotlin.math.pow

private const val PI = 3.14

class Circle(private val radius: Double) {
    fun getCircumference(): Double {
        return 2 * PI * radius
    }

    fun getAreaCircle(): Double {
        return PI * radius.pow(2)
    }
}


fun main() {
    val circle = Circle(2.0)

    println("Area: ${circle.getAreaCircle()}")
    println("Circumference: ${circle.getCircumference()}")
}