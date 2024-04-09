package lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val size = readln().toInt()
    if (size <= 0) {
        println("Количество ингредиентов должно быть положительным числом.")
        return
    }
    val ingredientsArray = arrayOfNulls<String>(size)

    for (i in 0 until size) {
        print("Введите ингредиент ${i + 1}: ")
        val ingredient = readln()
        ingredientsArray[i] = ingredient
    }
}