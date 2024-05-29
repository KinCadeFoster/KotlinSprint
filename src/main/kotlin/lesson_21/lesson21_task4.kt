package lesson_21

import java.io.File

fun File.writeToBeginning(word: String){
    val file = File("words.txt")
    val originalText = readText()
    val finalFile = "$word $originalText"
    file.writeText(finalFile)

}


fun main() {
    val file = File("words.txt")
    file.createNewFile()

    println(file.readText())
    file.writeToBeginning("Первое")
    println(file.readText())
    file.writeToBeginning("Второе")
    println(file.readText())
    file.writeToBeginning("Третье")
    println(file.readText())
}