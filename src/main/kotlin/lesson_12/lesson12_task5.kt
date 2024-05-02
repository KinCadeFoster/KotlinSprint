package lesson_12

import kotlin.random.Random

const val KELVIN_T = -273

class WeatherDayData(kelvinTempDay: Int, kelvinTempNight: Int, val precipitation: Boolean = false) {
    val dayTemp: Int = kelvinTempDay + KELVIN_T
    val nightTemp: Int = kelvinTempNight + KELVIN_T

    init {
        println("Дневаная температура в Цельсиях: $dayTemp ℃")
        println("Вечерняя температура в Цельсиях: $nightTemp ℃")
    }

    fun printWeather() {
        println("Дневаная температура в Цельсиях: $dayTemp ℃")
        println("Вечерняя температура в Цельсиях: $nightTemp ℃")
        println("Наличие осадков: $precipitation ℃")
    }

}


fun main() {
    val dataTemp: MutableList<WeatherDayData> = mutableListOf()
    var dataDayTemp: MutableList<Int> = mutableListOf()
    var dataNightTemp: MutableList<Int> = mutableListOf()
    var precipitationData: MutableList<Boolean> = mutableListOf()

    for (i in 1..30) {
        dataTemp.add(WeatherDayData(getRandomNumber(), getRandomNumber(), getRandomNumber() % 2 == 0))

    }

    dataDayTemp = getDailyTemp(dataTemp)
    dataNightTemp = getNightTemp(dataTemp)
    precipitationData = getPrecipitationDay(dataTemp)

    println("Среднедневная температура: ${"%.1f".format(dataDayTemp.average())} ℃")
    println("Средненочная температура: ${"%.1f".format(dataNightTemp.average())} ℃")
    println("Дней с осадками: ${precipitationData.count { it }}")
}


fun getRandomNumber(): Int {
    return Random.nextInt(200, 401)
}

fun getDailyTemp(dataTemp: MutableList<WeatherDayData>): MutableList<Int> {
    return dataTemp.map { it.dayTemp }.toMutableList()
}

fun getNightTemp(dataTemp: MutableList<WeatherDayData>): MutableList<Int> {
    return dataTemp.map { it.nightTemp }.toMutableList()
}

fun getPrecipitationDay(dataTemp: MutableList<WeatherDayData>): MutableList<Boolean> {
    return dataTemp.map { it.precipitation }.toMutableList()
}