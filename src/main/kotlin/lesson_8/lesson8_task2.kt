package lesson_8

fun main() {
    val ingredients = arrayOf("мука", "огурец", "масло", "вода", "лук", "гречка")

    print("Введите название ингредиента: ")
    val userIngredient = readln()
    var flagFound = false

    for (ingredient in ingredients) {
        if (ingredient == userIngredient)
            flagFound = true
    }

    if (flagFound) println("Ингредиент $userIngredient в рецепте есть") else println("Такого ингредиента в рецепте нет")
}