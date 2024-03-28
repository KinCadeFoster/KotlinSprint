package lesson_4

fun main(){
    val dayOfTraining = 5

    val isLegsDay = (dayOfTraining % 2) == 0

    println("""
        Упражнения для рук:    ${!isLegsDay}
        Упражнения для ног:    $isLegsDay
        Упражнения для спины:  $isLegsDay
        Упражнения для пресса: ${!isLegsDay}
    """.trimIndent())
}