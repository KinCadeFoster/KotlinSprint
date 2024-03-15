package lesson_4

const val TABLES = 13

fun main() {
    val reservationsToday = 13
    val reservationsTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${reservationsToday < TABLES}" +
                "\nДоступность столиков на завтра: ${reservationsTomorrow < TABLES}"
    )
}