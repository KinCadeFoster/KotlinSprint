package lesson_5

import kotlin.random.Random

fun main() {
    val winningNumbers = generateNumbers()
    val userNumbers = getUserNumbers()

    println("Ваши числа: $userNumbers")

    val matchingNumbers = winningNumbers.intersect(userNumbers)

    when (matchingNumbers.size) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа.")
    }
    println("Выигрышные числа: $winningNumbers")
}

fun generateNumbers(): List<Int> {
    return List(3) { Random.nextInt(43) }
}

fun getUserNumbers(): List<Int> {
    println("Введите три числа от 0 до 42 через пробел:")
    val input = readln()
    val numbers = input.split(" ").map { it.toInt() }

    return numbers
}