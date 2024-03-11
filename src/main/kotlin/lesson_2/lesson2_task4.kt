package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffInPercent = 20

    println(
        "Колиичество дополнительных материалов с бафом +$buffInPercent% для кристаллической руды: " +
                "${(crystalOre * (buffInPercent.toDouble() / 100)).toInt()}"
    )
    println(
        "Колиичество дополнительных материалов с бафом +$buffInPercent% для железной руды руды: " +
                "${(ironOre * (buffInPercent.toDouble() / 100)).toInt()}"
    )
}