package lesson_15

interface Flying {
    fun fly()
}

interface Floating {
    fun floating()
}

class Carp : Floating {
    override fun floating() {
        println("Я карась, я умею плавать")
    }
}

class Gull : Flying {
    override fun fly() {
        println("Я чайка, я летаю")
    }
}

class Duck : Floating, Flying {
    override fun floating() {
        println("Я утка, я плаваю")
    }

    override fun fly() {
        println("Я утка, я летаю")
    }
}


fun main() {
    val carp = Carp()
    val gull = Gull()
    val duck = Duck()

    carp.floating()
    gull.fly()
    duck.floating()
    duck.fly()
}