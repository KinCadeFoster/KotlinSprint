package lesson_13

class Contact3(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun printContact() {
        println("Имя: $name")
        println("Номер: $phoneNumber")
        println("Компания: ${company ?: "не указано"}")
    }
}

fun main() {
    // Создание и инициализация списка контактов
    val contacts = listOf(
        Contact3("Иван", 1234567890, "Рога и копыта"),
        Contact3("Алексей", 9999999999, "Копыта и рога"),
        Contact3("Мария", 9876543210, null),
        Contact3("Петр", 5555555555, null),
        Contact3("Елена", 1111111111, "null")
    )
    contacts.forEach { if (it.company != null) it.printContact() }
}