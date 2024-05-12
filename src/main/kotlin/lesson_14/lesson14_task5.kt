package lesson_14

abstract class MessageTemplate(
    val id: Int,
    val author: String,
    val message: String,
)


class ChildMessage(
    id: Int,
    author: String,
    message: String,
) : MessageTemplate(id, author, message) {

    fun printMessage(parentMessageId: Int) {
        println()
        println("\tСообщение из треда с id = $parentMessageId")
        println("\tАвтор: $author")
        println("\tСообщение: $message")
    }
}


class Message(
    id: Int,
    author: String,
    message: String,
    val treadMessage: MutableList<ChildMessage> = mutableListOf(),
) : MessageTemplate(id, author, message) {

    fun printMessage() {
        println()
        println("Сообщение с id = $id")
        println("Автор: $author")
        println("Сообщение: $message")
    }
}


class Chat(
    private val message: MutableList<Message> = mutableListOf(),
) {

    fun addMessage(messageText: String, messageAuthor: String) {
        val id: Int = if (message.isEmpty()) 1
        else message.last().id + 1
        message.add(Message(id, messageAuthor, messageText))
    }

    fun addThreadMessage(messageText: String, messageAuthor: String, parentMessageId: Int) {
        message.forEach {
            if (it.id == parentMessageId) {
                val id: Int = if (it.treadMessage.isEmpty()) 1
                else message.last().id + 1
                it.treadMessage.add(ChildMessage(id, messageAuthor, messageText))
            }
        }
    }

    fun printChat() {
        message.forEach { it ->
            it.printMessage()
            val id = it.id
            it.treadMessage.forEach {
                it.printMessage(id)
            }
        }
    }
}


fun main() {
    val chatMessage = Chat()

    chatMessage.addMessage("Сообщение 1", "Вася")
    chatMessage.addThreadMessage("Ответ на сообщение 1", "Петя", 1)
    chatMessage.addThreadMessage("Ответ на сообщение 1", "Конь Юлий", 1)

    chatMessage.addMessage("Сообщение 2", "Петя")
    chatMessage.addThreadMessage("Ответ на сообщение 2", "Вася", 2)
    chatMessage.addThreadMessage("Ответ на сообщение 2", "Олег", 2)

    chatMessage.printChat()

}