package views

import data.App
import data.Archive

class NoteChooseView(private val archive: Archive): View() {
    override fun menu() {
        println("Список заметок:")
        println("0. Создать заметку")
        archive.notes.forEachIndexed{ i, e -> println("${i + 1}. ${e.title}") }
        println("${archive.notes.size + 1}. Назад")
    }

    override fun validCommand(command: String): Boolean {
        if (command.all { c -> c.isDigit() }
                && command.isNotBlank()
                && command.toInt() >= 0 && command.toInt() <= archive.notes.size + 1) {
            return true
        } else {
            println("Введите корректный пункт меню")
            return false
        }
    }

    override fun selectCommand(command: String): View {
        //valid command
        return when(command.toInt()) {
            0 -> {
                NoteCreateView(archive)
            }

            archive.notes.size + 1 -> {
                ArchiveChooseView()
            }

            else -> {
                NoteView(archive.notes[command.toInt() - 1], archive)
            }

        }
    }
}