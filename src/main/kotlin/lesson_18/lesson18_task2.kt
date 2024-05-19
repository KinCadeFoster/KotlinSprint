package lesson_18

import kotlin.random.Random

abstract class Dice {
    open fun rollDice() {
    }
}

class Dice4 : Dice() {
    override fun rollDice() {
        val sides = 4
        val value = Random.nextInt(1, sides + 1)
        println("Брошен кубик с 4 гранями, результат броска: $value")
    }
}

class Dice6 : Dice() {
    override fun rollDice() {
        val sides = 6
        val value = Random.nextInt(1, sides + 1)
        println("Брошен кубик с 6 гранями, результат броска: $value")
    }
}

class Dice8 : Dice() {
    override fun rollDice() {
        val sides = 8
        val value = Random.nextInt(1, sides + 1)
        println("Брошен кубик с 8 гранями, результат броска: $value")
    }
}


fun main() {
    val dice4: Dice = Dice4()
    val dice6: Dice = Dice6()
    val dice8: Dice = Dice8()
    val listDice = listOf<Dice>(dice4, dice6, dice8)

    listDice.forEach { it.rollDice() }
}