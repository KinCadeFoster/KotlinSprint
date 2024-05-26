package lesson_19

enum class Gender {
    MALE,
    FEMALE
}

class Person(val name: String, val gender: Gender)

fun isInEnum(gender: String): Boolean {
    return try {
        Gender.valueOf(gender)
        true
    } catch (e: IllegalArgumentException) {
        false
    }
}


fun main() {
    val people = mutableListOf<Person>()

    println("Введите имя и пол человека через пробел в формате: имя пол")
    println("Пол может быть значениями: ${Gender.entries.joinToString(", ")}")

    while (people.size < 5) {

        println("Введите имя и пол через пробел:")
        val userData = readln().trim().split(" ")
        if (userData.size != 2) {
            println("Введен неверный формат, введите заново.")
            continue
        }

        val name = userData[0]
        val gender = userData[1].uppercase()

        if (isInEnum(gender)) {
            val genderForAdd = Gender.valueOf(userData[1].uppercase())
            people.add(Person(name, genderForAdd))
        } else {
            println("Пол введен не верно, введите заново.")
            continue
        }
    }

    println("Список введенных людей")
    for (person in people) {
        println("Имя: ${person.name}, пол: ${person.gender}")
    }
}