package data

class Archive(val name: String) {
    var notes = mutableListOf<Note>()

    fun createNote(title: String, text: String) {
        notes.add(Note(title, text))
    }
}