package lesson_6

import kotlin.random.Random


fun main() {
    var attempts = 3

    do {
        val num1 = getRandomNumber()
        val num2 = getRandomNumber()

        print("Решите пример $num1 + $num2 = ")
        val userAnswer = readln().toInt()

        if (num1 + num2 == userAnswer) {
            attempts = 0
            userLogin()
        } else {
            println("Ответ не верный, попробуй еще раз")
            attempts--
            if (attempts == 0) println("Доступ запрещен!")
        }
    } while (attempts > 0)
}

fun getRandomNumber(): Int {
    return Random.nextInt(1, 10)
}

fun userLogin() {
    println("Добро пожаловать!")
    print("Введите ваш логин: ")
    val login = readln()
    print("Введите ваш пароль: ")
    val password = readln()

    do {
        print("Для вхоода в приложение введите ваш логин: ")
        val enterLogin = readln()

        print("Для вхоода в приложение введите ваш пароль: ")
        val enterPassword = readln()

        if (login == enterLogin && password == enterPassword) {
            println("Вы авторизованы!")
            break
        } else {
            println("Неверный пароль, повторите еще раз!")
        }
    } while (login != enterLogin && password != enterPassword)
}