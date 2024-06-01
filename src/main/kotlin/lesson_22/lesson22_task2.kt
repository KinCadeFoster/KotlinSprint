package lesson_22

class RegularBook2(
    val bookName: String,
    val author: String,
)

data class DataBook2(
    val bookName: String,
    val author: String,
)


fun main() {
    val dataBook = DataBook2("Букварь", "СССР")
    val classBook = RegularBook2("Букварь", "СССР")

    // toString по умолчанию преопределен, но можно переопределить в ручную, если что то не устраивает
    println(dataBook)
    // сроковое представление объекта по умолчанию с отображение класса и адреса. Фиксится переопределением toString
    println(classBook)
}