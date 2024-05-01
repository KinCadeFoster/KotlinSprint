package lesson_13

class Contact(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun printContact() {
        println("Имя: $name")
        println("Номер: $phoneNumber")
        println("Компани: ${company ?: "не указано"}")
    }
}

fun main() {
    val cont = Contact("Вася", 7999999999)
    cont.printContact()
}