package lesson_16

class Order(
    private val order: Int,
    private var status: String,
) {

    private fun changeStatus(newStatus: String) {
        val oldStatus = status
        status = newStatus
        changeMessage(oldStatus, newStatus)

    }

    private fun changeMessage(status: String, newStatus: String) {
        println("Мы поменяли статус заказа №$order с $status на $newStatus.")
    }

    fun requestChangeStatus(newStatus: String) {
        println("Поступил запрос на изменение статуса заказа №$order на $newStatus.")
        changeStatus(newStatus)
    }
}


fun main() {
    val order = Order(12345, "В работе")

    order.requestChangeStatus("Выполнен")
}