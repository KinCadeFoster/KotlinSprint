package lesson_21

fun List<Int>.sumEvenNumbers(): Int {
    var sumCount = 0
    forEach { if (it % 2 == 0) sumCount += it}
    return sumCount
}

fun main() {
    val numbers = listOf(15, 20, 3, 44, 51, 65, 70, 81, 94, 101)
    println("Сумма четных чисел: ${numbers.sumEvenNumbers()}")
}