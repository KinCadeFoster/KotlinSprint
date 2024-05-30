package lesson_21

fun Map<String, Int>.maxCategory(): String {
    return this.entries.maxBy { it.value }.key
}


fun main() {
    val skills = mapOf(
        "Меч" to 20,
        "Пика" to 4,
        "Алебарда" to 5,
        "Лук" to 20
    )

    println("Лучше всего вы управляетесь с: ${skills.maxCategory()}")
}