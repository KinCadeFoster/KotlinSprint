package lesson_19

class SpaceShip {
    fun takeoff() {
        println("Корабль взлетает")
        // TODO: Реализовать логику взлета
    }

    fun land() {
        println("Корабль идет на посадку")
        // TODO: Реализовать логику посадки
    }

    fun shootAsteroid() {
        println("Стреляем в астеройд")
        // TODO: Реализовать логику отстрела метеора
    }

    fun selfDestruction() {
        println("Корабль самоуничтожается")
        TODO("Доделать логику самоуничтожения")
    }
}

fun main() {
    val spaceship = SpaceShip()
    spaceship.takeoff()
    spaceship.land()
    spaceship.shootAsteroid()
    spaceship.selfDestruction()
}