package lesson_3

fun main() {
    val moveString = "D2-D4;0"

    val parts = moveString.split(';', '-')
    val startMove = parts[0]
    val endMove = parts[1]
    val moveNumber = parts[2].toInt()

    println(startMove)
    println(endMove)
    println(moveNumber)
}