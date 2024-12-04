package views

import data.Archive
import data.Note

class NoteView(private val note: Note, private val archive: Archive): View() {
    override fun menu() {
        println(note.title + ":")
        println(note.text)
        println("Нажмите Enter для возврата к выбору заметок")
    }

    override fun validCommand(command: String): Boolean {
        return true
    }

    override fun selectCommand(command: String): View {
        return NoteChooseView(archive)
    }
}