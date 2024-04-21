package lesson_10

const val TOKEN_LENGTH = 32


fun main() {
    val storedLogin = "123"
    val storedPassword = "123"
    val storedCart = listOf("яблоки", "молоко", "груши")

    print("Введите ваш логин: ")
    val interLogin = readln()
    print("Введите ваш пароль: ")
    val interPassword = readln()

    if (getToken(interLogin, interPassword, storedLogin, storedPassword) == null) println("Логин или пароль не верны!")
    else {
        println("Продукты в вашей корзине: ")
        printCart(storedCart)
    }
}

fun getToken(interLogin: String, interPassword: String, storedUsername: String, storedPassword: String): String? {
    return if (interLogin == storedUsername && interPassword == storedPassword)
        getGenerateToken()
    else null

}

fun getGenerateToken(): String {
    val tokenChars = "A".."~"
    val token = StringBuilder()
    for (i in 1..TOKEN_LENGTH) {
        token.append(tokenChars.toString().random())
    }
    return token.toString()
}

fun printCart(storedCart: List<String>) {
    storedCart.forEach { println(it) }
}