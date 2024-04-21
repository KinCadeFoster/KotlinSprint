package lesson_10

import kotlin.random.Random

fun main() {
    playGame()
}

fun doDiceRoll() = Random.nextInt(1, 7)

fun playGame() {
    var humanWinsCounts = 0
    do {
        val userRoll = doDiceRoll()
        println("Бросок пользователя: $userRoll")
        val compRoll = doDiceRoll()
        println("Бросок компьюера: $compRoll")

        if (userRoll > compRoll) {
            println("Победило человечество")
            humanWinsCounts++
        } else if (userRoll < compRoll) println("Победила машина")
        else println("Ничья")

        println("Хотитет бросить кости еще раз?")
        val answer = readln()
        if (answer.equals("нет", ignoreCase = true)) {
            println("Количество выйгрышей: $humanWinsCounts")
            break
        }
    } while (true)
}