package lesson_17

class Folder(folderName: String, numberFiles: Int, private val isSecret: Boolean) {
    private val name = folderName
        get() {
            return if (isSecret) {
                "скрытая папка"
            } else {
                field
            }
        }
    private val numFiles = numberFiles
        get() {
            return if (isSecret) {
                0
            } else {
                field
            }
        }

    fun getFolderInfo() {
        println("Название папки: $name, количество файлов в папке: $numFiles")
    }
}


fun main() {
    val secureFolder = Folder("Секретная папка", 10, true)
    val simpleFolder = Folder("Обычная папка", 10, false)

    secureFolder.getFolderInfo()
    simpleFolder.getFolderInfo()
}