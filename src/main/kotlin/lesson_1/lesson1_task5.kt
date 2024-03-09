package lesson_1
const val SECONDS_IN_SPACE: Short = 6480
const val SECONDS_IN_MINUTE: Short = 60
const val SECONDS_IN_HOUR: Short = 3600


fun main() {
    val fullSecondsInSpace = (SECONDS_IN_SPACE % SECONDS_IN_MINUTE)
    val fullMinutesInSpace = (SECONDS_IN_SPACE % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val fullHoursInSpace = SECONDS_IN_SPACE / SECONDS_IN_HOUR

    println("Время проведенное в космосе: " + "%02d".format(fullHoursInSpace) + ":" + "%02d".format(fullMinutesInSpace)
            + ":" + "%02d".format(fullSecondsInSpace))

}