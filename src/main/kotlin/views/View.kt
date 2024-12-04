package views

abstract class View {
    abstract fun menu()

    abstract fun validCommand(command: String): Boolean

    abstract fun selectCommand(command: String): View
}