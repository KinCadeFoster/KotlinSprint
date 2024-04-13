package lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()

    for (i in 1..5) {
        print("Введите название $i ингредиента: ")
        val ingredient = readln().lowercase()
        ingredients.add(ingredient)
    }
    val sortedIngredients = ingredients.sorted().toMutableList()
    sortedIngredients[0] = sortedIngredients[0].replaceFirstChar { it.uppercase() }

    println("Список ингредиентов:")
    println(sortedIngredients.joinToString(", "))
}