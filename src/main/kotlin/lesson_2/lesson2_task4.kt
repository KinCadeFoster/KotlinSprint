package lesson_2

const val CRYSTAL_ORE = 7
const val IRON_ORE = 11
const val BUF = 0.2


fun main(){
    println("Кколиичество дополнительных материалов с бафом +20% для кристаллической руды: ${(CRYSTAL_ORE * BUF).toInt()}")
    println("Кколиичество дополнительных материалов с бафом +20% для железной руды руды: ${(IRON_ORE * BUF).toInt()}")
}