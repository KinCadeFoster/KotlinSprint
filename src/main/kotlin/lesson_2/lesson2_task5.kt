package lesson_2

const val DEPOSIT_AMOUNT = 70000
const val INTEREST_RATE = 16.7
const val DEPOSIT_TERM_YEARS = 20

fun main(){
    val amount = DEPOSIT_AMOUNT.toDouble() * Math.pow(1 + INTEREST_RATE / 100, DEPOSIT_TERM_YEARS.toDouble())

    println("%.3f".format(amount))
}
