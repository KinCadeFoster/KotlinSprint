package lesson_22

class RegularBook(
    val bookName: String,
    val author: String,
)

data class DataBook(
    val bookName: String,
    val author: String,
)


fun main() {
    val dataBook1 = DataBook("Букварь", "СССР")
    val dataBook2 = DataBook("Букварь", "СССР")

    val classBook1 = RegularBook("Букварь", "СССР")
    val classBook2 = RegularBook("Букварь", "СССР")

    // сравниваются значения
    println(dataBook1 == dataBook2)
    // сравниваются ссылки
    println(classBook1 == classBook2)
}