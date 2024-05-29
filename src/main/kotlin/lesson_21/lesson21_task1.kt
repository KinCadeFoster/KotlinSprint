package lesson_21

fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return count { it in vowels }
}

fun main() {
    val str = "hello"
    println("Количество гласных в строке \"$str\": ${str.vowelCount()}")
}