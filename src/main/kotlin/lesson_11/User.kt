package lesson_11

class User(
    val uid: String,
    val login: String,
    val password: String,
    val email: String,
    val myListStatus: List<String> = listOf("микрофон выключен", "разговаривает", "пользователь заглушен"),
    var textBadge: String = myListStatus[0],

    ) {
    override fun toString(): String {
        return "User(uid='$uid', login='$login', login='$password', email='$email', textBadge='$textBadge')"
    }
}