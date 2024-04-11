package lesson_10

import kotlin.random.Random

fun main() {
    val userRoll = diceRoll()
    println("Бросок пользователя: $userRoll")
    val compRoll = diceRoll()
    println("Бросок компьюера: $compRoll")

    if (userRoll > compRoll) println("Победило человечество")
    else if (userRoll < compRoll) println("Победила машина")
    else println("Ничья")
}

fun diceRoll() = Random.nextInt(1, 7)