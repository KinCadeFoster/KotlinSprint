package lesson_3

fun main(){
    val userName = "Василий"
    val dayGreetings = ", добрый день! "
    val nightGreetings = ", доброй ночи! "
    var greetings = ""

    greetings = userName + dayGreetings
    println(greetings)

    greetings = userName + nightGreetings
    println(greetings)
}