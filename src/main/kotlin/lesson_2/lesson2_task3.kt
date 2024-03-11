package lesson_2
const val  SECONDS_IN_MINUTE = 60



fun main(){
    val trainArrivalHour = 9
    val trainArrivalMinute = 39
    val travelTime = 457
    val arrivalTimeInMinutes = (trainArrivalHour * SECONDS_IN_MINUTE) + trainArrivalMinute
    val arrivalTime = arrivalTimeInMinutes + travelTime
    val arrivalHour = arrivalTime / SECONDS_IN_MINUTE
    val arrivalMinute = arrivalTime % SECONDS_IN_MINUTE

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")
}