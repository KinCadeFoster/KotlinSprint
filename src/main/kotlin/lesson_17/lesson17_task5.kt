package lesson_17

class UserData(userLogin: String, userPassword: String) {
    var userLogin = userLogin
        set(value) {
            field = value
            println("Вы успешно поменяли login на: $value")
        }


    var userPassword = userPassword
        get() {
            return "*".repeat(field.length)
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }
}


fun main() {
    val user = UserData("Vasia", "12345")

    user.userPassword = "54321"
    println(user.userPassword)
    user.userLogin = "Petya"
}