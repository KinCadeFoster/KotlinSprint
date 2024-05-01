package lesson_12
const val KELVIN = -273

class WeatherInf(kelvinTempDay: Int, kelvinTempNight: Int) {
    val dayTemp: Int = kelvinTempDay + KELVIN
    val nightTemp: Int = kelvinTempNight + KELVIN
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
    val day1 = WeatherInf(500, 700)
    val day2 = WeatherInf(100, 500)
}