package lesson_14

open class Liner2(
    val name: String = "Нет названия",
    val capacity: Int = 1000,
    val speed: Int = 100,
) {
    fun printShip() {
        println("Название корабля: $name")
        println("Вместимость корабля: $capacity")
        println("Скорость карабля: $speed")
    }

    open fun loadingShip() {
        println("Выдвигаю горизонтальный трап со шкафута")
    }
}

class Cargo2(
    name: String,
    capacity: Int = 500,
    speed: Int = 70,
) : Liner2(name, capacity, speed) {

    override fun loadingShip() {
        println("Активирую погрузочный кран")
    }
}

class Icebreaker2(
    name: String,
    capacity: Int = 5,
    speed: Int = 30,
) : Liner2(name, capacity, speed) {

    override fun loadingShip() {
        println("Открываю ворота со стороны кормы")
    }
}


fun main() {
    val linerShip = Liner2("Лайнер")
    val cargoShip = Cargo2("Волчара")
    val icebreakerShip = Icebreaker2("Хруст")

    linerShip.printShip()
    linerShip.loadingShip()
    cargoShip.printShip()
    cargoShip.loadingShip()
    icebreakerShip.printShip()
    icebreakerShip.loadingShip()
}