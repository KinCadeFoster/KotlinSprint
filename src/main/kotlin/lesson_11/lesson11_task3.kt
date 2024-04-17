package lesson_11

class Room(
    val cover: String,
    val roomName: String,
    val userList: MutableList<MutableMap<String, Any>>,
    private val myListStatus: List<String> = listOf("микрофон выключен", "разговаривает", "пользователь заглушен"),
) {
    fun addUserToRoom(user: User) {
        val userData = mutableMapOf<String, Any>()
        userData["nickName"] = (user.nickName)
        userData["avatar"] = (user.avatar)
        userData["speakStatus"] = (myListStatus[0])

        userList.add(userData)

    }

    fun updateStatusBadge(nickName: String, newBadgeStatus: Int) {
        userList.forEach { it ->
            if (it["nickName"] == nickName) {
                it["speakStatus"] = myListStatus[newBadgeStatus]
            }
        }
    }

    fun getTextBadgeStatus(nickName: String): () -> String {
        userList.forEach { it ->
            if (it["nickName"] == nickName) {
                return { it["speakStatus"].toString() }
            }
        }
        return { "Статус не найден" }
    }

    override fun toString(): String {
        return "User(cover='$cover', roomName='$roomName', userList='$userList')"
    }
}

class User(
    val nickName: String,
    val avatar: String,

    ) {
    override fun toString(): String {
        return "User(nickname='$nickName', login='$avatar')"
    }
}


fun main() {
    val user1 = User(
        nickName = "Васян",
        avatar = "avatar.jpeg"
    )
    val room1 = Room(
        cover = "picture.jpg",
        roomName = "Chat",
        userList = mutableListOf()
    )
    room1.addUserToRoom(user1)
    room1.updateStatusBadge(user1.nickName, 2)
    println(room1.getTextBadgeStatus(user1.nickName)())

    println(user1)
    println(room1)
}