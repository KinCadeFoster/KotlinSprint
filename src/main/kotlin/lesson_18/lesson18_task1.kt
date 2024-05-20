package lesson_18

class Order {
    fun printOrder(
        orderNumber: Int,
        item: String,
    ) {
        println("Заказан товар: $item")
    }

    fun printOrder(
        orderNumber: Int,
        items: List<String>,
    ) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }
}


fun main() {
    val order1 = Order()
    val order2 = Order()

    order1.printOrder(1, "Видеокарта")
    order2.printOrder(2, listOf("Процессор", "Мышь", "Плюмбус"))
}