package lesson_9

fun main() {
    val ingredients = mutableListOf("мука", "огурец", "масло")

    printListIngredients(ingredients, "В рецепте есть следующие ингредиенты:")

    println("Желаете добавить еще?")
    val answer = readln().lowercase()

    if (answer == "да") {
        addIngredients(ingredients)
        printListIngredients(ingredients, "Теперь в рецепте есть следующие ингредиенты:")
    }
}

fun printListIngredients(ingredients: MutableList<String>, text: String) {
    println(text)
    ingredients.forEach {
        println(it)
    }
}

fun addIngredients(ingredients: MutableList<String>) {
    println("Какой ингредиент вы хотите добавить?")
    ingredients.add(readln().lowercase())
}
