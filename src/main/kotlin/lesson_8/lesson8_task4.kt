package lesson_8

fun main() {
    val ingredients = arrayOf("мука", "огурец", "масло", "вода", "лук", "гречка")
    for (ingredient in ingredients) {
        println("Ингредиент ${ingredients.indexOf(ingredient) + 1}: $ingredient")
    }

    print("Введите названеие ингредиента на замену: ")
    val userIngredientSearch = readln()

    if (userIngredientSearch !in ingredients) println("Такого ингредиента нет.")
    else {
        println("Менять будем на: ")
        val userNewIngredient = readln()
        ingredients[ingredients.indexOf(userIngredientSearch)] = userNewIngredient

        println("Готово! Вы сохранили следующий список:")
        for (ingredient in ingredients) {
            println("Ингредиент ${ingredients.indexOf(ingredient) + 1}: $ingredient")
        }
    }
}