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

fun main() {
    val user1 = User(
        uid = "1",
        login = "user1",
        password = "123",
        email = "123@123.ru"
    )

    val user2 = User(
        uid = "2",
        login = "user2",
        password = "321",
        email = "321@321.ru"
    )

    println(user1)
    println(user2)

}