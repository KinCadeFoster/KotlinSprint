package lesson_7


fun main() {
    print("Минимальная длинна пароля 6 символов.\nВведите длинну пароля: ")
    var passwordLength = readln().toInt()
    if (passwordLength < 6) {
        println("Минимальнная длинна пароля 6 символов. Длинна установлена в 6 символов!")
        passwordLength = 6
    }
    val password = generatePassword(passwordLength)
    println(password)
}

fun generatePassword(passwordLength: Int): StringBuilder {
    val charsLow = 'a'..'z'
    val charsUp = 'A'..'Z'
    val numbers = 0..9
    val chars = charsUp + charsLow + numbers
    val password = StringBuilder()

    do {
        password.clear()
        for (i in 1..passwordLength) {
            password.append(chars.random())
        }
    } while (!(password.any { it.isDigit() } && password.any { it.isLowerCase() } && password.any { it.isUpperCase() }))
    return password
}