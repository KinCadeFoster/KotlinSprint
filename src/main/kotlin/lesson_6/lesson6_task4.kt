package lesson_6

import kotlin.random.Random

fun main() {
    var attempts = 5
    val number = getRandomNumber()

    while (attempts >= 0) {
        if (attempts == 0) {
            println("Было загадано число $number")
            break
        }
        print("Введите ваше число: ")
        val userNumber = readln().toInt()
        if (userNumber == number) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно")
            attempts--
        }
    }
}

fun getRandomNumber(): Int {
    return Random.nextInt(1, 9)
}