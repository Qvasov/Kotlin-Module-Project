import data.App
import views.ArchiveChooseView
import views.ExitView
import views.View
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var view: View = ArchiveChooseView()

    while (true) {
        if (view is ExitView) {
            return
        }
        view.menu()
        val command = scanner.nextLine()
        if (view.validCommand(command)) {
            view = view.selectCommand(command)
        }
    }
}