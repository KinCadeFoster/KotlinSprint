package lesson_18

abstract class Package {
    open fun areaCalculation(): Int {
        return 0
    }
}

class RectangularPackage(
    private val length: Int,
    private val width: Int,
    private val height: Int
) : Package() {

    override fun areaCalculation(): Int {
        return 2 * (length * width + length * height + width * height)
    }
}

class CubicPackage(private val edgeLength: Int) : Package() {
    override fun areaCalculation(): Int {
        return 6 * edgeLength * edgeLength
    }
}

fun main() {
    val rectangularPackage: Package = RectangularPackage(2, 2, 2)
    val cubicPackage: Package = CubicPackage(5)

    println("Площадь поверхности прямоугольной коробки: ${rectangularPackage.areaCalculation()}")
    println("Площадь поверхности кубической коробки: ${cubicPackage.areaCalculation()}")
}