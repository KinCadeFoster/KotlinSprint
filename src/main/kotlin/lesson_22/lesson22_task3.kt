package lesson_22

data class DataBook2(
    val bookName: String,
    val author: String,
    val year: Int,
)


fun main() {
    val dataBook = DataBook2("Букварь", "СССР", 1950)

    val (bookName, author, year) = dataBook

    println(bookName)
    println(author)
    println(year)
}