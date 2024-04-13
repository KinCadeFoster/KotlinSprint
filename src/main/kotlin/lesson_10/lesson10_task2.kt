package lesson_10

fun main(){
    print("Введите логин (минимум 4 символа): ")
    val userLogin = readln()

    print("Введите пароль (минимум 4 символа): ")
    val userPassword = readln()

    if (!checkLength(userLogin) || !checkLength(userPassword))
        println("Логин или пароль недостаточно длинные")
}

fun checkLength(string: String): Boolean {
    return string.length > 3
}