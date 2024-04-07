package lesson_8

fun main() {
    val viewsWeek = arrayOf(100, 150, 200, 180, 220, 250, 300)
    var totalViews = 0

    for (views in viewsWeek) {
        totalViews += views
    }
    println("Общее количество просмотров за неделю: $totalViews")
}