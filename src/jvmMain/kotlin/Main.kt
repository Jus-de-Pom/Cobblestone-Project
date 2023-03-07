import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import components.TopBar
import util.maximizeUndecorated

@Composable
@Preview
fun App() {

    MaterialTheme {

        TopBar()

    }

}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState().maximizeUndecorated(),
        undecorated = true,
        resizable = false,
        title = "Cobblestone - Mod Maker",
    ) {
        App()
    }
}
