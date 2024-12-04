package views

import kotlin.system.exitProcess

class ExitView: View() {
    override fun menu() {
        exitProcess(0)
    }

    override fun validCommand(command: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun selectCommand(command: String): View {
        TODO("Not yet implemented")
    }
}