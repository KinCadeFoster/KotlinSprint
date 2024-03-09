package lesson_2
const val TRAIN_ARRIVAL_HOUR = 9
const val TRAIN_ARRIVAL_MINUTE = 39
const val TRAVEL_TIME = 457
const val  SECONDS_IN_MINUTE = 60



fun main(){
    val arrivalTimeInMinutes = (TRAIN_ARRIVAL_HOUR * SECONDS_IN_MINUTE) + TRAIN_ARRIVAL_MINUTE
    val arrivalTime = arrivalTimeInMinutes + TRAVEL_TIME
    val arrivalHour = arrivalTime / SECONDS_IN_MINUTE
    val arrivalMinute = arrivalTime % SECONDS_IN_MINUTE

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")
}