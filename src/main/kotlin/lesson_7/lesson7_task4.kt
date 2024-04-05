package lesson_7

fun main() {
    print("Введите сколько секунд засечь: ")
    val userSeconds = readln().toInt()

    for (i in userSeconds downTo 1) {
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло!")
}