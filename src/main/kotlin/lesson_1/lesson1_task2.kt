package lesson_1

fun main() {
    val numberOfOrders: Int = 75
    val thankYouMessage: String = "Спасибо за ваш заказ! Надеемся увидеть вас снова!"
    var countEmployees: Int = 2000

    println("Количество заказов: $numberOfOrders")
    println("Приветственный текст: $thankYouMessage")
    //println("Колличество работкников: $countEmployees")

    countEmployees -= 1
    println("Колличество работкников: $countEmployees")
}
