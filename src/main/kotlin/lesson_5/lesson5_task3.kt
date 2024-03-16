package lesson_5

fun main() {
    val winningNumber1 = 1
    val winningNumber2 = 2

    print("Введите первое число от 0 до 42: ")
    val number1 = readln().toInt()

    print("Введите второе число от 0 до 42: ")
    val number2 = readln().toInt()

    if (number1 == winningNumber1 && number2 == winningNumber2 || number1 == winningNumber2 && number2 == winningNumber1) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (number1 == winningNumber1 || number1 == winningNumber2 || number2 == winningNumber1 || number2 == winningNumber2) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Числа для победы были: $winningNumber1 и $winningNumber2.")
}