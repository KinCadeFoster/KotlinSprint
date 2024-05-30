package lesson_21

class Player(
    private val heroName: String,
    var health: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean {
    return health == maxHealth
}


fun main() {
    val hero1 = Player("Васян", 50, 100)
    val hero2 = Player("Евлампий", 100, 100)

    println(hero1.isHealthy())
    println(hero2.isHealthy())
}