package lesson_16

class UserData(
    val login: String,
    private val password: String,
) {

    fun checkPassword(verifiablePassword: String): Boolean {
        return verifiablePassword == password
    }
}

fun main() {
    val user = UserData("Vasia", "123")

    println(user.checkPassword("111"))
    println(user.checkPassword("123"))
}