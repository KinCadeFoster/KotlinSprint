package lesson_16

class Circle(private val radius: Double) {
    private val Pi = 3.14

    fun getCircumference(): Double {
        return 2 * Pi * radius
    }

    fun getAreaCircle(): Double {
        return Pi * radius * radius
    }
}

fun main() {
    val circle = Circle(5.0)

    println(circle.getAreaCircle())
    println(circle.getCircumference())
}