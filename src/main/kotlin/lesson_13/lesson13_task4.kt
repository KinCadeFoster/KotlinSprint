package lesson_13

class Contact4(val name: String, val phoneNumber: Long, val company: String? = null) {

    fun printContact() {
        println("Имя: $name")
        println("Номер: $phoneNumber")
        println("Компания: ${company ?: "не указано"}")
    }
}

fun main() {
    val telephoneBook = mutableListOf<Contact4>()

    for (i in 1..3) {
        println("Введите данные для добавления в телефонную книгу!")
        print("Введите Ваше имя: ")
        val name = readLine().toString()
        print("Введите номер телефона: ")
        val phone = readLine()?.toLongOrNull()
        if (phone == null) {
            println("Вы ввели некоректный номер, данные не могут быть добавлены в телефонную книгу")
            continue
        }
        print("Введите название компании: ")
        var company = readLine()
        if (company.isNullOrBlank()) company = null

        telephoneBook.add(Contact4(name, phone, company))
    }

    telephoneBook.forEach { it.printContact() }
}