package lesson_6

import kotlin.random.Random


fun main() {
    var attempts = 3

    while (attempts >= 0) {
        val num1 = getRandomNumber()
        val num2 = getRandomNumber()

        if (attempts == 0) {
            println("Доступ запрещен!")
            break
        }

        print("Решите пример $num1 + $num2 = ")
        val userAnswer = readln().toInt()

        if (num1 + num2 != userAnswer) {
            println("Ответ не верный, попробуй еще раз")
            attempts--
        } else {
            attempts = -1
            println("Добро пожаловать!")
            print("Введите ваш логин: ")
            val login = readln()
            print("Введите ваш пароль: ")
            val password = readln()

            while (true) {
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
            }
        }

    }


}

fun getRandomNumber(): Int {
    return Random.nextInt(1, 10)
}