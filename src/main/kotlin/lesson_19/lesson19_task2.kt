package lesson_19

enum class Category(private val textName: String) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHER("Разное");

    fun getTextName(): String {
        return textName
    }
}

class Product(val name: String, private val id: Int, private val category: Category) {
    fun printInfo() {
        println("Название: $name")
        println("ID: $id")
        println("Категория: ${category.getTextName()}")
    }
}

fun main() {
    val product1 = Product("Штаны", 1, Category.CLOTHING)
    val product2 = Product("Ручка", 2, Category.STATIONERY)
    val product3 = Product("Лопата", 3, Category.OTHER)

    product1.printInfo()
    println()
    product2.printInfo()
    println()
    product3.printInfo()
}