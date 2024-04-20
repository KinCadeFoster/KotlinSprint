package lesson_12

class WeatherInfo(kelvinTemp: Int) {
    private val celsiusTemp: Int = kelvinTemp - 273

    fun printWeather() {
        println("Температура в Цельсиях: $celsiusTemp ℃")
    }

}


fun main() {
    val day1 = WeatherInfo(500)
    val day2 = WeatherInfo(100)

    println(day1.printWeather())
    println(day2.printWeather())
}