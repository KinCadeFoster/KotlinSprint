package lesson_16

import kotlin.random.Random

class Dice(){
    private val number = getRandom()

    private fun getRandom(): Int {
        return Random.nextInt(1 ,7)
    }

    fun printNumber(){
        println(number)
    }
}


fun main(){
    val number = Dice()
    number.printNumber()
}