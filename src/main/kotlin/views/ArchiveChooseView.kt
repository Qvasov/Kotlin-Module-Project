package views

import data.App
import data.Archive

class ArchiveChooseView : View() {
    override fun menu() {
        println("Список архивов:")
        println("0. Создать архив")
        App.archives.forEachIndexed { i, e -> println("${i + 1}. ${e.name}") }
        println("${App.archives.size + 1}. Выход")
    }

    override fun validCommand(command: String): Boolean {
        if (command.all { c -> c.isDigit() }
                && command.isNotBlank()
                && command.toInt() >= 0 && command.toInt() <= App.archives.size + 1) {
            return true
        } else {
            println("Введите корректный пункт меню")
            return false
        }
    }

    override fun selectCommand(command: String): View {
        return when (command.toInt()) {
            0 -> {
                ArchiveCreateView()
            }

            App.archives.size + 1 -> {
                ExitView()
            }

            else -> {
                NoteChooseView(App.archives[command.toInt() - 1])
            }
        }
    }
}