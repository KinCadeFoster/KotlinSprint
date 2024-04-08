package lesson_6

fun main() {
    print("Введите ваш логин: ")
    val login = readln()
    print("Введите ваш пароль: ")
    val password = readln()


    do {
        print("Для вхоода в приложение введите ваш логин: ")
        val enterLogin = readln()

        print("Для вхоода в приложение введите ваш пароль: ")
        val enterPassword = readln()
        val loginFlag = login != enterLogin && password != enterPassword

        if (loginFlag)
            println("Неверный пароль, повторите еще раз!")

    } while (loginFlag)

    println("Вы авторизованы!")
}