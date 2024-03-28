package lesson_5
import kotlin.random.Random

fun main() {
    val number1 = getRandomNumber()
    val number2 = getRandomNumber()

    print("Решите пример: $number1 + $number2\nВведите ответ: ")
    val answer = readln().toInt()

    if (answer == (number1 + number2)) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}

fun getRandomNumber(): Int {
    return Random.nextInt(10)
}