package views

import data.App
import data.Archive
import java.util.Scanner

class NoteCreateView(private val archive: Archive): View() {
    override fun menu() {
        println("Введите название заметки:")
    }

    override fun validCommand(command: String): Boolean {
        if (command.isBlank()) {
            return false
        } else {
            return true
        }
    }

    override fun selectCommand(title: String): View {
        while (true) {
            println("Введите текст заметки:")
            var command = Scanner(System.`in`).nextLine()
            if (validCommand(command)) {
                archive.createNote(title, command)
                break
            }
        }

        return NoteChooseView(archive)
    }
}