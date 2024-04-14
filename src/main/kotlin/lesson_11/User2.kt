package lesson_11

class User2(
    val uid: String,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    override fun toString(): String {
        return "User(uid='$uid', login='$login', password='$password', email='$email', bio='$bio')"
    }
}