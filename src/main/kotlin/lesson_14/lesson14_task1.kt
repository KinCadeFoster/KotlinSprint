package lesson_14

open class Liner(
    val name: String = "Нет названия",
    val capacity: Int = 1000,
    val speed: Int = 100,
) {
    fun printShip(){
        println(name)
        println(capacity)
        println(speed)
    }
}

class Cargo(
    name: String,
    capacity: Int = 500,
    speed: Int = 70,
) : Liner(name, capacity, speed) {
}

class Icebreaker(
    name: String,
    capacity: Int = 5,
    speed: Int = 30,
) : Liner(name, capacity, speed) {
}

fun main(){
    val linerShip = Liner("Лайнер")
    val cargoShip = Cargo("Волчара")
    val icebreakerShip = Icebreaker("Хруст")

    linerShip.printShip()
    cargoShip.printShip()
    icebreakerShip.printShip()
}