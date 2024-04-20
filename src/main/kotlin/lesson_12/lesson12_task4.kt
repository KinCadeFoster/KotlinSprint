package lesson_12

class WeatherInfo(kelvinTemp: Int) {
    private val celsiusTemp: Int = kelvinTemp - 273

    init {
        println("Температура в Цельсиях: $celsiusTemp ℃")
    }

    fun printWeather() {
        println("Температура в Цельсиях: $celsiusTemp ℃")
    }

}


fun main() {
    val day1 = WeatherInfo(500)
    val day2 = WeatherInfo(100)

}