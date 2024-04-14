package lesson_11

fun main() {
    val user1 = User(
        uid = "1",
        login = "123",
        password = "123",
        email = "123@123.ru",
    )
    val room1 = Room(
        cover = "picture.jpg",
        roomName = "Chat",
        userList = mutableListOf()
    )

    println(user1)
    println(room1)

    room1.addUserToRoom(user1)
    room1.updateStatusBadge(user1, 2)
    println(room1.getTextBadgeStatus(user1))

    println(user1)
    println(room1)
}

