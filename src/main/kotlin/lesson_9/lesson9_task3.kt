package lesson_9

fun main() {
    val ingredientsForOmelette = listOf(2, 50, 15)

    println("Сколько порции нужно приготовить?")
    val servingQuantity = readln().toInt()

    val totalIngredients = ingredientsForOmelette.map { it * servingQuantity }
    println("На $servingQuantity порций вам понадобится:")
    println("Яиц – ${totalIngredients[0]}, молока – ${totalIngredients[1]} мл, " +
            "сливочного масла – ${totalIngredients[2]} г.")
}