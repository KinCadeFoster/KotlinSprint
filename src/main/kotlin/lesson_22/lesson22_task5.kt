package lesson_22

import java.time.LocalDate

data class GalacticGuide(
    val name: String,
    val description: String,
    val startEventTime: LocalDate,
    val distanceFromEarth: Int,
)


fun main() {
    val eventAlphaCentauri = GalacticGuide(
        name = "Альфа Центавра",
        description = "Межгалактическая вечеринка",
        startEventTime = LocalDate.parse("2040-04-18"),
        distanceFromEarth = 1000
    )

    println("Будет происходить событие: ${eventAlphaCentauri.component1()}")
    println("Описание мероприятия: ${eventAlphaCentauri.component2()}")
    println("Дата проведения: ${eventAlphaCentauri.component3()}")
    println("Расстояние от Земли (в условных еденицах): ${eventAlphaCentauri.component4()}")
}