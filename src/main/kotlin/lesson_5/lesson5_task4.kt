package lesson_5

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {
    println(
        "Внимание, пассажир. Моя обязанность, как обычно, незавидная, - " +
                "приветствовать вас на борту корабля \"Heart of Gold\". [вздыхает...] " +
                "\nЧто ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. " +
                "\nЯ всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. " +
                "[вздыхает ещё глубже...] " + "\nДа, вперед, пожалуйста, вводите свои данные..."
    )
    println("Введите имя пользователя")

    val userName = readln()
    if (userName != USER_NAME) {
        println("Такого пользователя нет, пожалуйста зарегистрируйтесь в системе")
    } else {
        println("Введите пароль")
        val userPassword = readln()
        if (userPassword == USER_PASSWORD)
            println(
                "Ваши данные проверены, и о, чудо, они верны... Пользователь \"Zaphod\", вам разрешено " +
                        "входить на борт корабля \"Heart of Gold\""
            )
        else println("Пароль не верен")
    }

}