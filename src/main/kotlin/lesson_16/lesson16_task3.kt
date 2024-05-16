package lesson_16

class UserData(
    private val login: String,
    private val password: String,
) {

    fun checkPassword(verifiablePassword: String): Boolean {
        return verifiablePassword == password
    }
}

fun main() {
    val user = UserData("Vasia", "123")
    println("Password is correct: ${user.checkPassword("111")}")
    println("Password is correct: ${user.checkPassword("123")}")
}