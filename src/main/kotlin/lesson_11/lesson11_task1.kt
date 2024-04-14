package lesson_11

fun main() {
    val user1 = User(
        uid = "1",
        login = "user1",
        password = "123",
        email = "123@123.ru"
    )

    val user2 = User(
        uid = "2",
        login = "user2",
        password = "321",
        email = "321@321.ru"
    )

    println(user1)
    println(user2)

}