package lesson_7

fun main() {
    val numbers = 1000..9999
    var flagPassword = false

    do {
        val code = numbers.random()
        println("Ваш код авторизации: $code")
        print("Введите ваш код: ")
        val userCode = readln().toInt()

        if (userCode == code) {
            println("Вы авторизованы!")
            flagPassword = true
        }
    } while (!flagPassword)
}