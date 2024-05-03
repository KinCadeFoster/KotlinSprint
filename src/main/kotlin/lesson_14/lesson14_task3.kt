package lesson_14

import kotlin.math.PI

abstract class Figure(val color: String) {
    abstract fun calculateSquare(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calculateSquare(): Double {
        return PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun calculateSquare(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}


fun main() {
    val blackCircle = Circle("black", 10.0)
    val whiteCircle = Circle("white", 5.0)
    val blackRectangle = Rectangle("black", 10.0, 10.0)
    val whiteRectangle = Rectangle("white", 5.0, 5.0)


    val figuresList = listOf(blackCircle, whiteCircle, blackRectangle, whiteRectangle)

    var blackFigurePerimeter = 0.0
    figuresList.forEach {
        if (it.color == "black") {
            blackFigurePerimeter += it.calculatePerimeter()
        }
    }
    println("Сумма периметров черных фигур: $blackFigurePerimeter")

    var whiteFigureSquare = 0.0
    figuresList.forEach {
        if (it.color == "white") {
            whiteFigureSquare += it.calculateSquare()
        }
    }
    println("Сумма площадей белых фигур: $whiteFigureSquare")
}