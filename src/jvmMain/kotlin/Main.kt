import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import components.TopBar
import util.maximizeUndecorated
import kotlin.system.exitProcess

class MainWindow {

    companion object {
        lateinit var state: WindowState

        fun close() {
            exitProcess(0)
        }
    }

}

fun setState(windowState: WindowState): WindowState {
    MainWindow.state = windowState
    return windowState
}

@Composable
@Preview
fun App() {

    TopBar()

}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        undecorated = true,
        resizable = false,
        state = setState(rememberWindowState().maximizeUndecorated()),
        title = "Cobblestone - Mod Maker",
    ) {
        App()
    }
}
