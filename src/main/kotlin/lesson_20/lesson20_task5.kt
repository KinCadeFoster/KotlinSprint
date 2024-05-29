package lesson_20

import kotlin.random.Random

class Robot {
    private val phrases = listOf(
        "Хорошего дня",
        "Уходи отсюда",
        "Дело сделано",
        "Я тебя не знаю",
        "Убить всех человеков"
    )

    private var modifier: ((String) -> String)? = null

    fun say(){
        if (modifier == null)
        println(phrases[Random.nextInt(phrases.size)])
        else println(modifier!!(phrases[Random.nextInt(phrases.size)]))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}


fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier { str -> str.split(" ").reversed().joinToString(" ") }
    robot.say()
}