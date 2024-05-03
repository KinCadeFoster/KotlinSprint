package lesson_14

abstract class HeavenlyBody(
    val name: String,
    val presenceOfAtmosphere: Boolean = false,
    val suitabilityForPlanting: Boolean = false,
) {
}

class Satellite(
    name: String,
    presenceOfAtmosphere: Boolean = false,
    suitabilityForPlanting: Boolean = false,
) : HeavenlyBody(name, presenceOfAtmosphere, suitabilityForPlanting) {
}

class Planet(
    name: String,
    presenceOfAtmosphere: Boolean = false,
    suitabilityForPlanting: Boolean = false,
) : HeavenlyBody(name, presenceOfAtmosphere, suitabilityForPlanting) {
    val listSatellites = mutableListOf<Satellite>()


    fun addSatellite(satellite: Satellite) {
        listSatellites.add(satellite)
        println("Добавлен спутник ${satellite.name}, для планеты $name")
    }


    fun printPlanetInfo() {
        println("Планета: $name")
        if (listSatellites.isEmpty()) println("Спитников у планеты нет")
        else {
            println("Спутники планеты $name: ")
            listSatellites.forEach { println(it.name) }
        }
    }
}


fun main() {
    val satellite1 = Satellite("Луна 1", true, true)
    val satellite2 = Satellite("Луна 2")
    val planet = Planet("Пандора", true)

    planet.addSatellite(satellite1)
    planet.addSatellite(satellite2)

    planet.printPlanetInfo()
}