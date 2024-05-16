package lesson_16
private const val PI = 3.14

class Circle(private val radius: Double) {
    fun getCircumference(): Double {
        return 2 * PI * radius
    }

    fun getAreaCircle(): Double {
        return PI * radius * radius
    }
}


fun main() {
    val circle = Circle(2.0)

    println("Area: ${circle.getAreaCircle()}")
    println("Circumference: ${circle.getCircumference()}")
}