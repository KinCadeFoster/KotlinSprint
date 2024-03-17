package lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val WRONG_SEASON = "зима"

fun main() {

    val sunToday = true
    val openTentToday = true
    val airHumidityToday = 20
    val seasonToday = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${sunToday == IS_SUNNY && 
                openTentToday == IS_AWNING_OPEN && airHumidityToday == AIR_HUMIDITY && seasonToday != WRONG_SEASON
        }"
    )
}