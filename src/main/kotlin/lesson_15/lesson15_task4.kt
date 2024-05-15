package lesson_15

interface Search {
    fun searchComponents(): List<Component>
}

class Instrument(val name: String, val quantity: Int) : Search {
    override fun searchComponents(): List<Component> {
        println("Выполняется поиск комплектующих для инструмента '$name'")
        return listOf()
    }
}

class Component(val name: String, val quantity: Int)


fun main() {
    val drum = Instrument("Барабан", 4)
    val piano = Instrument("Рояль", 5)

    val drumSticks = Component("Палочки для барабанов", 10)
    val pianoStrings = Component("Струны для рояля", 20)
    val pianoKeys = Component("Клавиши для рояля", 10)

    val pianoComponents = piano.searchComponents()
    val drumComponents = drum.searchComponents()

    pianoComponents.forEach { println("${it.name}: ${it.quantity} шт.") }
    drumComponents.forEach { println("${it.name}: ${it.quantity} шт.") }
}