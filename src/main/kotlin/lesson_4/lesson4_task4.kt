package lesson_4

fun main(){
    val dayOfTraining = 5

    val isHandsDay = (dayOfTraining % 2 == 1)
    val isLegsDay = !isHandsDay

    println("""
        Упражнения для рук:    $isHandsDay
        Упражнения для ног:    $isLegsDay
        Упражнения для спины:  $isLegsDay
        Упражнения для пресса: $isHandsDay
    """.trimIndent())
}