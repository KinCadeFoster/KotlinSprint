package lesson_8


fun main() {
    val ingredients = arrayOf("мука", "огурец", "масло", "вода", "лук", "гречка")

    print("Введите название ингредиента: ")
    val userIngredient = readln()

    if (ingredients.contains(userIngredient)) println("Ингредиент $userIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}