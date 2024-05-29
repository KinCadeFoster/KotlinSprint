package lesson_20

fun main() {
    val list = listOf("Строка 1", "Строка 2", "Строка 3", "Строка 4", "Строка 5", "Строка 6", "Строка 7", "Строка 8")

    val lambdaList = list.map { string: String ->
        if (list.indexOf(string) % 2 == 0) println("Нажат элемент $string")
    }
}