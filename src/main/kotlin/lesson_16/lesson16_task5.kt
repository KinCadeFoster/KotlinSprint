package lesson_16

class Hero(
    private val name: String,
    private var health: Int = 100,
    private var impactForce: Int = 5,
) {

    fun takingDamage(damage: Int) {
        health -= damage
        if (health < 1) die()
        println("Ваш герой получил $damage едениц урона")
        heroStatus()
    }

    fun healing(heal: Int) {
        if (health > 0) health += heal
        println("Ваш герой восполнил $heal едениц урона")
        heroStatus()

    }

    private fun die() {
        impactForce = 0
        health = 0
    }

    fun heroStatus() {
        if (health < 1) println(
            "Уже не важно, вы погибли и " +
                    "ваш героой: $name, имеет здровье: $health и силу удара: $impactForce"
        )
        else println("Ваш героой: $name, имеет здровье: $health и силу удара: $impactForce")
    }
}


fun main() {
    val userHero = Hero("Vasia", impactForce = 10)

    userHero.heroStatus()
    userHero.takingDamage(99)
    userHero.healing(10)
    userHero.takingDamage(100)
}