package lesson_20

class Hero(
    private val heroName: String,
    var health: Int,
    val maxHealth: Int,
) {
    fun getHeroInfo() {
        println("Герой: $heroName имеет $health едениц здоровья из максимально возможных $maxHealth")
    }
}

val healing: (Int, Hero) -> Unit = { healing: Int, hero: Hero ->
    hero.health += healing
    if (hero.health > hero.maxHealth) hero.health = hero.maxHealth
}


fun main() {
    val hero = Hero("Васян", 50, 100)

    hero.getHeroInfo()
    healing(10, hero)
    hero.getHeroInfo()
    healing(100, hero)
    hero.getHeroInfo()
}