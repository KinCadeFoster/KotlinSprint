package lesson_3

fun main() {
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var lastName = "Андреева"
    var age = 20

    println("$lastName $name $patronymic, $age лет")

    lastName = "Содорова"
    age += 2

    println("$lastName $name $patronymic, $age года")
}