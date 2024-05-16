package lesson_17

class Ship(name: String, avrSpeed: Int, port: String){
    var name = name
        set(value) {
            println("Имя каробля менять нельзя!")
        }
    var avrSpeed = avrSpeed
    var port = port
}


fun main(){
    val ship = Ship("Виктория", 100,"Владивосток")

    println(ship.name)
    ship.name = "Другое название"
    println(ship.name)
}