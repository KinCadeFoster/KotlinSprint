package lesson_20

class Hero2(
    val name: String,
    var hasKey: Boolean = false,
) {
    fun getKey() {
        hasKey = true
    }
}

val checkForKey: (Hero2) -> Unit = { hero: Hero2 ->
    if (hero.hasKey) println("${hero.name} дверь открыл!")
    else println("${hero.name} не может открыть дверь, нет ключа!")
}


fun main() {
    val hero = Hero2("Васян")
    checkForKey(hero)
    hero.getKey()
    checkForKey(hero)
}