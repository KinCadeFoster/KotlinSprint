import java.util.*

class ForumMember(val userId: UUID, val userName: String)
class ForumMessage(val authorId: UUID, val message: String)

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(UUID.randomUUID(), userName)
        members.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: UUID, message: String): ForumMessage? {
        if (members.any { it.userId == authorId }) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
            return newMessage
        }
        return null
    }

    fun printMessage() {
        for (message in messages) {
            for (member in members) {
                if (member.userId == message.authorId) {
                    println("${member.userName}: ${message.message}")
                }
            }
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Вася")
    val user2 = forum.createNewUser("Петя")

    forum.createNewMessage(user1.userId, "Сообщение от Васи")
    forum.createNewMessage(user1.userId, "Еще одно сообщение от Васи")
    forum.createNewMessage(user2.userId, "Петя пишет")
    forum.createNewMessage(user2.userId, "Петя пишет второй раз")

    forum.printMessage()
}
