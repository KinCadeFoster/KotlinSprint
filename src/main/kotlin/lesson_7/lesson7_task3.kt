package lesson_7

fun main() {
    print("Введите число: ")
    val userNumber = readln().toInt()
    val number = StringBuilder()

    for (i in 0 until userNumber + 1 step 2) {
        number.append(i)
    }
    println(number)
}