package lesson_12
const val KELVIN_TEMP = -273

class WeatherInfo(kelvinTempDay: Int, kelvinTempNight: Int) {
    val dayTemp: Int = kelvinTempDay + KELVIN_TEMP
    val nightTemp: Int = kelvinTempNight + KELVIN_TEMP
    val precipitation: Boolean = false

    init {
        println("Дневаная температура в Цельсиях: $dayTemp ℃")
        println("Вечерняя температура в Цельсиях: $nightTemp ℃")
    }

    fun printWeather() {
        println("Дневаная температура в Цельсиях: $dayTemp ℃")
        println("Вечерняя температура в Цельсиях: $nightTemp ℃")
    }

}


fun main() {
    val day1 = WeatherInfo(500, 700)
    val day2 = WeatherInfo(100, 500)
}