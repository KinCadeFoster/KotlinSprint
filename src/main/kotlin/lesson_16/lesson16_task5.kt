package lesson_16

import kotlin.math.abs

class Hero(
    private val name: String,
    private val maxHealth: Int = 100,
    private var health: Int = maxHealth,
    private var impactForce: Int = 5,

) {
    fun takingDamage(damage: Int) {
        if (health > 1) {
            if (health - damage < 1)  {
                health -= abs(damage)
                println("Ваш герой получил $damage едениц урона.")
                die()
            }
            else {
                println("Ваш герой получил $damage едениц урона.")
                health -= abs(damage)
            }
        }
    }

    fun healing(heal: Int) {
        if (health > 0) {
            if (health == maxHealth) {
                println("Вы здоровы, не нужно попусту тратить припасы!")
            }
            else if (health + heal > maxHealth) {
                println("Вы получили лечения на ${maxHealth - health} едениц, ${health + heal - maxHealth} едениц потратилось в пустую. " +
                        "Максимальное здровье не может быть более $maxHealth едениц!")
                health = maxHealth
            }
            else if (health + heal < 100){
                health += heal
                println("Вы получили лечения на $heal едениц.")
            }
        }
    }

    private fun die() {
        impactForce = 0
        health = 0
        println("Вы мертвы!")
    }

    fun heroStatus() {
        println("Ваш героой: $name, имеет здровье: $health и силу удара: $impactForce.")
    }
}


fun main() {
    val userHero = Hero("Vasia", impactForce = 10)

    userHero.heroStatus()
    userHero.takingDamage(99)
    userHero.heroStatus()
    userHero.healing(10)
    userHero.heroStatus()
    userHero.healing(100)
    userHero.heroStatus()
    userHero.healing(100)
    userHero.takingDamage(100)
    userHero.heroStatus()
    userHero.takingDamage(100)
}