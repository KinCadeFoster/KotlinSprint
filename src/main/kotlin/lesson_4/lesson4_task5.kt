package lesson_4

const val SHIP_NOT_DAMAGED = true
const val MIN_CREW_MEMBERS = 55
const val MAX_CREW_MEMBERS = 70
const val MIN_PROVISION_COUNT = 50
const val WEATHER_GOOD = true

fun main() {
    val shipNotDamage: Boolean = readln().toBoolean()
    val crewCount: Int = readln().toInt()
    val provisionCount: Int = readln().toInt()
    val isWeatherFavorable: Boolean = readln().toBoolean()

    println(
        (shipNotDamage == SHIP_NOT_DAMAGED) &&
        (crewCount in MIN_CREW_MEMBERS..MAX_CREW_MEMBERS) &&
        (provisionCount > MIN_PROVISION_COUNT) ||
        (crewCount == MAX_CREW_MEMBERS) &&
        (isWeatherFavorable == WEATHER_GOOD) &&
        (provisionCount >= MIN_CREW_MEMBERS))
}