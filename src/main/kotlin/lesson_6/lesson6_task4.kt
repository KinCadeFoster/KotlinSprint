package lesson_6

import kotlin.random.Random

fun main() {
    var attempts = 5
    val number = getRandomNumber()

    do {
        print("Введите ваше число: ")
        val userNumber = readln().toInt()
        if (userNumber == number) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно")
            attempts--
        }
    } while (attempts > 0)
    println("Было загадано число $number")
}
