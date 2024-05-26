package lesson_18

import kotlin.random.Random

abstract class Dice(private val sides: Int) {
    open fun rollDice() {
        val value = Random.nextInt(1, sides + 1)
        println("Брошен кубик с $sides гранями, результат броска: $value")
    }
}

class Dice4 : Dice(4)
class Dice6 : Dice(6)
class Dice8 : Dice(8)


fun main() {
    val dice4: Dice = Dice4()
    val dice6: Dice = Dice6()
    val dice8: Dice = Dice8()
    val listDice = listOf<Dice>(dice4, dice6, dice8)

    listDice.forEach { it.rollDice() }
}