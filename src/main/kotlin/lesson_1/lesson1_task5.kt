package lesson_1
const val SECONDS_IN_SPACE: Short = 6480

fun main() {
    val fullSecondsInSpace = (SECONDS_IN_SPACE%60)
    val fullMinutesInSpace = (SECONDS_IN_SPACE%3600)/60
    val fullHoursInSpace = SECONDS_IN_SPACE/3600

    println("Время проведенное в космосе: " + "%02d".format(fullHoursInSpace) +":"+ "%02d".format(fullMinutesInSpace)
            +":"+ "%02d".format(fullSecondsInSpace))

}