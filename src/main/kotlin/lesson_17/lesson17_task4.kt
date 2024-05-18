package lesson_17

class Package(private val postNumber: Int, location: String) {
    private var location = location
        set(value) {
            field = value
            count++
        }
    private var count = 0

    fun printTracking() {
        println("Посылка с №$postNumber находится в/на $location и уже поменяла $count местоположений")
    }

    fun changeLocation(newLocation: String) {
        location = newLocation
    }
}


fun main() {
    val post = Package(123, "Почта")

    post.printTracking()
    post.changeLocation("Сортировка")
    post.printTracking()
    post.changeLocation("Главное отделение почты")
    post.printTracking()
}