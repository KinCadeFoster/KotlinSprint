package lesson_21

fun List<Int>.sumEvenNumbers(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val numbers = listOf(15, 20, 3, 44, 51, 65, 70, 81, 94, 101)
    println("Сумма четных чисел: ${numbers.sumEvenNumbers()}")
}