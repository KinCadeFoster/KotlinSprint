package lesson_11

fun main() {
    val user1 = User2(
        uid = "1",
        login = "user1",
        password = "123",
        email = "123@123.ru"
    )

    print("Добавляем БИО?: ")
    if (readln().lowercase() == "да") {
        println("Введите текст который будем добавлять: ")
        user1.bio = readln()
    }

    print("Меняем пароль?: ")
    if (readln().lowercase() == "да") {
        print("Введите старый пароль: ")
        if (readln() == user1.password) {
            print("Введите новый пароль: ")
            user1.password = readln()
            println("Пароль изменен")
        } else println("Пароль введен не верно")
    }
    println(user1)
}