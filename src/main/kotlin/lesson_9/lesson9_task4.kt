package lesson_9

fun main() {
    println("Введите пять ингредиентов, разделенных запятой и пробелом:")
    val inputList = readln().split(", ")

    val ingredients = inputList.toMutableList()
    val sortedIngredients = ingredients.sorted()

    println("Отсортированный список ингредиентов:")
    for (ingredient in sortedIngredients) {
        println(ingredient)
    }
}