package lesson_13

class Contact5(val name: String, val phoneNumber: Long, val company: String? = null) {

    fun printContact() {
        println("Имя: $name")
        println("Номер: $phoneNumber")
        println("Компания: ${company ?: "не указано"}")
    }
}

fun main() {
    val userInput = readln()

    try {
        val phone = userInput.toLong()
    } catch (e: NumberFormatException) {
        println(e)
    }
}