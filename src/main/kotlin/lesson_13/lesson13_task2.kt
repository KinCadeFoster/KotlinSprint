package lesson_13

class Contact2(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun printContact() {
        println("Имя: $name")
        println("Номер: $phoneNumber")
        println("Компания: ${company ?: "не указано"}")
    }
}

fun main() {
    val cont = Contact2("Вася", 7999999999)
    cont.printContact()
}