package lesson_17

class Ship(name: String, val avrSpeed: Int, val port: String){
    var name = name
        set(value) {
            println("Имя каробля менять нельзя!")
        }
}


fun main(){
    val ship = Ship("Виктория", 100,"Владивосток")

    println(ship.name)
    ship.name = "Другое название"
    println(ship.name)
}