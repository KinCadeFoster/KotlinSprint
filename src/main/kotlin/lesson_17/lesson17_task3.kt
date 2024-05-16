package lesson_17

class Folder(folderName: String, numberFiles: Int, folderSecurity: Boolean) {
    private val name = folderName
        get() {
            return if (security) {
                "скрытая папка"
            } else {
                field
            }
        }
    private val numFiles = numberFiles
        get() {
            return if (security) {
                0
            } else {
                field
            }
        }
    private val security = folderSecurity

    fun folderInfo() {
        println("Название папки: $name, количество файлов в папке: $numFiles")
    }
}


fun main() {
    val secureFolder = Folder("Секретная папка", 10, true)
    val simpleFolder = Folder("Обычная папка", 10, false)

    secureFolder.folderInfo()
    simpleFolder.folderInfo()
}