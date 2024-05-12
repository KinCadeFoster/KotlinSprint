package lesson_15

abstract class WeatherStationStats {
    abstract fun getData(): Double
}

class Temperature(private val data: Double) : WeatherStationStats() {
    override fun getData(): Double {
        return data
    }
}

class PrecipitationAmount(private val data: Double) : WeatherStationStats() {
    override fun getData(): Double {
        return data
    }
}

class WeatherServer() {
    fun sendDataToServer(dataSend: WeatherStationStats) {
        if (dataSend is Temperature) {
            println("Передаю на сервер температуру (тип данных Temperature): ${dataSend.getData()}")
        } else if (dataSend is PrecipitationAmount) {
            println("Передаем данные об осадках (тип данных PrecipitationAmount): ${dataSend.getData()}")
        } else {
            println("Ошибка, ничего не передаю")
        }
    }
}


fun main() {
    val temperature = Temperature(30.5)
    val precipitationAmount = PrecipitationAmount(4.0)

    val server = WeatherServer()

    server.sendDataToServer(temperature)
    server.sendDataToServer(precipitationAmount)
}