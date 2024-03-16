package lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введите ваш год рождения: ")
    val yearOfBirth = readln().toInt()
    val userAge = LocalDate.now().year - yearOfBirth


    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран приложения")
    }
}