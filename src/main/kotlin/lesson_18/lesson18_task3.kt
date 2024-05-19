package lesson_18

abstract class Animals(val name: String) {
    open fun eat() {
    }

    open fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animals(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animals(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animals(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}


fun main() {
    val fox: Animals = Fox("Лиса")
    val dog: Animals = Dog("Собакен")
    val cat: Animals = Cat("Котофей")
    val animalsList = listOf<Animals>(fox, dog, cat)

    animalsList.forEach { it.eat() }
}