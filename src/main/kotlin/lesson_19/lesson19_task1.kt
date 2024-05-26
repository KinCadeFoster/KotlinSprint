package lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}


fun main() {
    println("Вы можете добавить в свой аквариум следующих рыб:")
    for (fish in Fish.entries) {
        println(fish)
    }
}