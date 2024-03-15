package lesson_4


const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_WEIGHT_VOLUME = 100

fun main() {
    val cargo1Weight = 20
    val cargo1Volume = 80

    val cargo2Weight = 50
    val cargo2Volume = 100


    println(
        "Груз 1 с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории 'Average': " +
                "${
                    (cargo1Weight > AVERAGE_WEIGHT_MIN && cargo1Weight <= AVERAGE_WEIGHT_MAX)
                            && cargo1Volume < AVERAGE_WEIGHT_VOLUME
                }"
    )

    println(
        "Груз 2 с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории 'Average': " +
                "${
                    (cargo2Weight > AVERAGE_WEIGHT_MIN && cargo2Weight <= AVERAGE_WEIGHT_MAX)
                            && cargo2Volume < AVERAGE_WEIGHT_VOLUME
                }"
    )
}