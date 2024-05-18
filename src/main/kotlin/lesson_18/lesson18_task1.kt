package lesson_18

interface Order {
    fun printOrder()
}

class SingleItemOrder(private val orderNumber: Int, private val item: String) : Order {
    override fun printOrder() {
        println("Заказан товар: $item")
    }
}

class MultipleItemsOrder(private val orderNumber: Int, private val items: List<String>) : Order {
    override fun printOrder() {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }
}

fun main() {
    val order1: Order = SingleItemOrder(1, "Видеокарта")
    val order2: Order = MultipleItemsOrder(2, listOf("Процессор", "Мышь", "Плюмбус"))

    order1.printOrder()
    order2.printOrder()
}