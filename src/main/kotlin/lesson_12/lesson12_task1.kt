package lesson_12

class WeatherData {
    var dayTemp = 0
    var nightTemp = 0
    var precipitation = false


    override fun toString(): String {
        return "User(dayTemp='$dayTemp', nightTemp='$nightTemp', precipitation='$precipitation')"
    }
}


fun main() {
    val day1 = WeatherData()
    val day2 = WeatherData()

    day1.dayTemp = 10
    day1.nightTemp = 5
    day1.precipitation = true

    day2.dayTemp = 100
    day2.nightTemp = 50

    println(day1)
    println(day2)
}