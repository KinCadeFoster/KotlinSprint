package lesson_20

class Hero(
    val name: String,
    var hasKey: Boolean = false,
) {
    fun getKey() {
        hasKey = true
    }
}

val checkForKey: (Hero) -> Unit = { hero: Hero ->
    if (hero.hasKey) println("${hero.name} дверь открыл!")
    else println("${hero.name} не может открыть дверь, нет ключа!")
}


fun main() {
    val hero = Hero("Васян")
    checkForKey(hero)
    hero.getKey()
    checkForKey(hero)
}