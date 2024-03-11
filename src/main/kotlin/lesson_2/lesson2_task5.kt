package lesson_2

import kotlin.math.pow


fun main() {
    val depositAmount = 70000
    val interestRate = 16.7
    val depositTermYears = 20

    val amount = depositAmount * (1 + interestRate / 100).pow(depositTermYears)

    println("%.3f".format(amount))
}
