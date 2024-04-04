package lesson_7

import kotlin.random.Random

fun main() {
    val charsLow = 'A'..'z'
    val charsUp = 'A'..'Z'
    val chars = charsUp + charsLow
    val numbers = 0..9
    val password = StringBuilder()

    print("Минимальная длинна пароля 6 символов.\nВведите длинну пароля: ")
    var passwordLength = readln().toInt()
    if (passwordLength < 6) {
        println("Минимальнная длинна пароля 6 символов. Длинна установлена в 6 символов!")
        passwordLength = 6
    }
    for (i in 1..passwordLength) {
        if (getRandomNumber() % 2 == 0) password.append(chars.random())
        else password.append(numbers.random())
    }
    println(password)
}


fun getRandomNumber(): Int {
    return Random.nextInt(1, 9)
}