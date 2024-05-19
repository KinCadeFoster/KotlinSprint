package lesson_18

abstract class Shape

class Point(val x: Number, val y: Number) : Shape()

class Square(val lengthSide: Number, val startPoint: Point) : Shape()

class Circle(val radius: Number, val startPoint: Point)

class Screen {
    fun draw(point: Point) {
        println("Рисуем точку в координатах: x = ${point.x}, y = ${point.y}")
    }

    fun draw(square: Square) {
        println(
            "Рисуем квадрат со сторонами = ${square.lengthSide}, " +
                    "начиная с координаты x = ${square.startPoint.x}, y = ${square.startPoint.y}"
        )
    }

    fun draw(circle: Circle) {
        println(
            "Рисуем круг радиусом = ${circle.radius}, " +
                    "начиная с координаты x = ${circle.startPoint.x}, y = ${circle.startPoint.y}"
        )
    }
}


fun main() {
    val screen = Screen()

    val point = Point(5, 10.9)
    val square = Square(10, Point(0.6, 0))
    val circle = Circle(10.6, Point(3, 3))

    screen.draw(point)
    screen.draw(square)
    screen.draw(circle)
}