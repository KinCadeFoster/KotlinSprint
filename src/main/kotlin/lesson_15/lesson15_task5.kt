package lesson_15

interface Movable {
    fun drive() {
        println("Мы едем, едем, едем...")
    }
}

interface PassengerCarrier {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(passengers: Int)
    fun unloadPassengers(passengers: Int)
}

interface CargoCarrier {
    val maxCargoWeight: Int
    var currentCargoWeight: Int

    fun loadCargo(weight: Int)
    fun unloadCargo(weight: Int)
}

class PassengerCar(override var currentPassengers: Int = 0) : PassengerCarrier, Movable {
    override val maxPassengers: Int = 3

    override fun loadPassengers(passengers: Int) {
        if (passengers + currentPassengers > maxPassengers) println("Не влазим")
        else {
            currentPassengers += passengers
            println("Добавили пассажиров: $passengers, всего едет: $currentPassengers")
        }
    }

    override fun unloadPassengers(passengers: Int) {
        if (currentPassengers - passengers < 0) println(
            "Не можем высадить $passengers пассажиров, " +
                    "всего $currentPassengers пассажиров"
        )
        else {
            currentPassengers -= passengers
            println("Выгрузили пассажиров: $passengers, всего осталось: $currentPassengers")
        }
    }
}

class CargoCar(override var currentPassengers: Int = 0, override var currentCargoWeight: Int = 0) : PassengerCarrier,
    CargoCarrier, Movable {
    override val maxPassengers: Int = 1

    override fun loadPassengers(passengers: Int) {
        if (passengers + currentPassengers > maxPassengers) println("Не влазим")
        else {
            currentPassengers += passengers
            println("Добавили пассажиров: $passengers, всего едет: $currentPassengers")
        }
    }

    override fun unloadPassengers(passengers: Int) {
        if (currentPassengers - passengers < 0) println(
            "Не можем высадить $passengers пассажиров, " +
                    "всего $currentPassengers пассажиров"
        )
        else {
            currentPassengers -= passengers
            println("Выгрузили пассажиров: $passengers, всего осталось: $currentPassengers")
        }
    }

    override val maxCargoWeight: Int = 2

    override fun loadCargo(weight: Int) {
        if (weight + currentCargoWeight > maxCargoWeight) println("Слишком тяжело")
        else {
            currentCargoWeight += weight
            println("Добавили груза: $weight, всего едет: $currentCargoWeight")

        }
    }

    override fun unloadCargo(weight: Int) {
        if (currentCargoWeight - weight < 0) println(
            "Не можем выгрузить $weight, " +
                    "всего $currentCargoWeight груза"
        )
        else {
            currentCargoWeight -= weight
            println("Выгрузили: $weight, осталось груза: $currentCargoWeight")
        }
    }

}


fun main() {
    println("Поехал первый авто:")
    val passCar1 = PassengerCar(1)
    passCar1.loadPassengers(5)
    passCar1.loadPassengers(1)
    passCar1.drive()
    passCar1.unloadPassengers(2)

    println()
    println("Поехал второй авто:")
    val passCar2 = PassengerCar(0)
    passCar2.loadPassengers(3)
    passCar2.drive()
    passCar2.unloadPassengers(3)

    println()
    println("Поехал грузовой авто:")
    val cargoCar = CargoCar(0)
    cargoCar.loadCargo(2)
    cargoCar.loadPassengers(1)
    cargoCar.drive()
    cargoCar.unloadCargo(2)
    cargoCar.unloadPassengers(1)
}