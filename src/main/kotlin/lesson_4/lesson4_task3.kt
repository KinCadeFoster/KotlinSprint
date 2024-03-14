package lesson_4

const val SUN = true
const val OPEN_TENT = true
const val AIR_HUMIDITY = 20
const val WRONG_SEASON = "зима"

fun main() {

    val sunToday = true
    val openTentToday = true
    val airHumidityToday = 20
    val seasonToday = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            sunToday == SUN && openTentToday == OPEN_TENT 
                    && airHumidityToday == AIR_HUMIDITY && seasonToday != WRONG_SEASON
        }"
    )
}