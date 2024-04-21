package lesson_12

class WeatherDailyData (private val dayTemp: Int, private val nightTemp: Int, private val precipitation: Boolean){

    override fun toString(): String {
        return "User(dayTemp='$dayTemp', nightTemp='$nightTemp', precipitation='$precipitation')"
    }
}


fun main() {
    val day1 = WeatherDailyData(10, 20, true)
    val day2 = WeatherDailyData(50, 100, false)

    println(day1)
    println(day2)
}