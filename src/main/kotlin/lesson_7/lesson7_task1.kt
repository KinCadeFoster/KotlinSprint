package lesson_7

fun main() {
    println(randomPassword())
}

fun randomPassword(): String {
    val passwordLetters = 'a'..'z'
    val passwordDigits = 0..9
    val password = StringBuilder()

    for (i in 1..4) {
        password.append(passwordDigits.random())
        password.append(passwordLetters.random())
    }
    return password.toString()
}