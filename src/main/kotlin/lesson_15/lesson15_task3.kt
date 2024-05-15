package lesson_15

abstract class UserClass(
    val name: String,
) {
    abstract fun writeMessage()
    abstract fun readMessage()
}

class User(name: String) : UserClass(name) {
    override fun writeMessage() {
        println("Я пользователь, могу писать сообщения")
    }

    override fun readMessage() {
        println("Я пользователь, могу читать сообщения")
    }
}

class Admin(name: String) : UserClass(name) {
    override fun writeMessage() {
        println("Я админ, могу писать сообщения")
    }

    override fun readMessage() {
        println("Я админ, могу читать сообщения")
    }

    fun deleteUser() {
        println("Я адмиин, могу удалять пользователей")
    }

    fun deleteMessage() {
        println("Я адмиин, могу удалять сообщения")
    }
}


fun main() {
    val user = User("Юзер")
    val admin = Admin("Админ")

    user.readMessage()
    user.writeMessage()

    admin.readMessage()
    admin.writeMessage()
    admin.deleteMessage()
    admin.deleteUser()
}