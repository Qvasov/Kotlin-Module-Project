package views

import data.App

class ArchiveCreateView : View() {
    override fun menu() {
        println("Введите название архива:")
    }

    override fun validCommand(command: String): Boolean {
        if (command.isBlank()) {
            return false
        } else {
            return true
        }
    }

    override fun selectCommand(command: String): View {
        App.createArchive(command)
        return ArchiveChooseView()
    }
}