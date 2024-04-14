package lesson_11

class Room(
    val cover: String,
    val roomName: String,
    val userList: MutableList<User>,
) {
    fun addUserToRoom(user: User) {
        userList.add(user)
    }

    fun updateStatusBadge(user: User, newBadgeStatus: Int) {
        userList.forEach {
            if (it.login == user.login) {
                it.textBadge = it.myListStatus[newBadgeStatus]
            }
        }
    }

    fun getTextBadgeStatus(user: User): String {
        return user.textBadge
    }

    override fun toString(): String {
        return "User(cover='$cover', roomName='$roomName', userList='$userList')"
    }
}