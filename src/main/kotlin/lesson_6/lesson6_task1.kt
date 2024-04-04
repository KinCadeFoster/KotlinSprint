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

        if (login == enterLogin && password == enterPassword) {
            println("Вы авторизованы!")
            break
        } else {
            println("Неверный пароль, повторите еще раз!")
        }
    } while (login != enterLogin && password != enterPassword)

}