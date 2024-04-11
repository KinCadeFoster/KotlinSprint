package lesson_9

fun main() {
    val ingredients = listOf("мука", "огурец", "масло", "вода", "лук", "гречка")

    println("В рецепте есть следующие ингредиенты:")
    ingredients.forEach {
        println(it)
    }
}