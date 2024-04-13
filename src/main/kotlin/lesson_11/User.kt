package lesson_11

class User(
    val uid: String,
    val login: String,
    val password: String,
    val email: String,
) {
    override fun toString(): String {
        return "User(uid='$uid', login='$login', login='$password', email='$email')"
    }
}