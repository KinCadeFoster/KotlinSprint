package lesson_10

fun main() {
    print("Введите длинну пароля: ")
    val passwordLength = readln().toInt()
    val password = generatePassword(passwordLength)
    println(password)
}

fun generatePassword(passwordLength: Int): StringBuilder {
    val specialChars = '!'.. '/'
    val numbers = 0..9
    val password = StringBuilder()


    for (i in 1..passwordLength) {
        if (i % 2 == 0) {
            password.append(specialChars.random())
        } else {
            password.append(numbers.random())
        }
    }
    return password
}