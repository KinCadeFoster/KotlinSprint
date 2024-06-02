package lesson_22

import java.lang.Thread.sleep

class MainScreenViewModel{
    data class MainScreenState(
        var data: String? = null,
        var isLoading: Boolean = false,
    )
    private var state = MainScreenState()

    fun getStatus(): MainScreenState {
        return state
    }

    fun loadData(){
        state = MainScreenState(isLoading = true)
        println(getStatus())
        sleep(1000)
        val data = "Полученные данные"
        state = MainScreenState(data = data, isLoading = false)
    }
}


fun main() {
    val state = MainScreenViewModel()
    println(state.getStatus())
    state.loadData()
    println(state.getStatus())
}