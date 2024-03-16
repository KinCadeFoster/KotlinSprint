package lesson_4

fun main(){
    val hasHullDamage: Boolean = readln().toBoolean()
    val crewCount: Int = readln().toInt()
    val provisionCount: Int = readln().toInt()
    val isWeatherFavorable: Boolean = readln().toBoolean()

    println(!hasHullDamage && crewCount in 55..70 && provisionCount > 50 ||
            crewCount == 70 && isWeatherFavorable && provisionCount >= 50)
}