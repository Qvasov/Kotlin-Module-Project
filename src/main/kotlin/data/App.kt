package data

object App {
    val archives = mutableListOf<Archive>()

    fun createArchive(name: String) {
        archives.add(Archive(name))
    }
}