package lesson_19

enum class Cartridges(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var typeOfAmmunition: Cartridges? = null

    fun reloadGun(cartridges: Cartridges) {
        typeOfAmmunition = cartridges
        println("Зарядили оружие боеприпасом: ${typeOfAmmunition!!.name}")
    }

    fun shooting() {
        if (typeOfAmmunition == null) {
            println("Оружие не заряжено и не может стрелять")
        } else {
            println("Мы нанесли ${typeOfAmmunition!!.damage} едениц урона")
        }
    }
}

fun main() {
    val tank = Tank()

    tank.shooting()

    tank.reloadGun(Cartridges.BLUE)
    tank.shooting()

    tank.reloadGun(Cartridges.GREEN)
    tank.shooting()

    tank.reloadGun(Cartridges.RED)
    tank.shooting()
}