package lesson_6

fun main() {
    println("Введите на сколько секунд запустить таймер?")
    var timerSeconds = readln().toInt()

    while (timerSeconds >= 0) {
        if (timerSeconds > 0) {
            println("Осталось секунд: $timerSeconds")
            Thread.sleep(1000)
            timerSeconds--
        } else {
            println("Время вышло!")
            break
        }
    }
}