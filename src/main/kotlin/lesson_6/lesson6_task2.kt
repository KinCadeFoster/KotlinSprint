package lesson_6

fun main() {
    println("Введите на сколько секунд запустить таймер?")
    val timerSeconds = readln().toInt()

    if (timerSeconds == 0) {
        println("Вы некорректно ввели количество секунд")
    } else {
        Thread.sleep(timerSeconds * 1000L)
        println("Прошло $timerSeconds секунд")
    }
}
