package lesson_22

class MainScreenViewModel{
    data class MainScreenState(
        var data: String? = null,
        var isLoading: Boolean = false,
    )
    private var state = MainScreenState()

    fun getStatus() {
        if (state.isLoading) println("Происходит загрузка данных")
        else if (state.data == null) println("Данные отсутствуют")
        else println("Все в полрядке, данные загружены")
    }

    fun loadData(){
        state = MainScreenState(isLoading = true)

        getStatus()
        val data = "Полученные данные"
        state = MainScreenState(data = data, isLoading = false)
    }
}


fun main() {
    val state = MainScreenViewModel()
    state.getStatus()
    state.loadData()
    state.getStatus()
}