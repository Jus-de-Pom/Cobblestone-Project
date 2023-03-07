package util

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import constants.PropertiesKeys
import java.awt.GraphicsEnvironment
import java.awt.Toolkit

var WindowState.isMaximized: Boolean
    get() = CustomWindowStates.getWindowStateProperty<Boolean>(this, PropertiesKeys.IsMaximized) as Boolean
    set(value) { CustomWindowStates.setWindowStateProperty(this, PropertiesKeys.IsMaximized pairWith value) }

fun WindowState.maximizeUndecorated(): WindowState {
    this.placement = WindowPlacement.Floating
    this.position = WindowPosition(Alignment.TopStart)

    val graphicsConfiguration = GraphicsEnvironment.getLocalGraphicsEnvironment().defaultScreenDevice.defaultConfiguration
    val insets = Toolkit.getDefaultToolkit().getScreenInsets(graphicsConfiguration)
    val screenSize = Toolkit.getDefaultToolkit().screenSize

    this.size = DpSize(screenSize.width.dp, (screenSize.height - insets.bottom).dp)
    this.isMaximized = true

    return this
}

fun WindowState.setFloating(): WindowState {
    this.placement = WindowPlacement.Floating
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    this.size = DpSize((screenSize.width / 2).dp, (screenSize.height / 2).dp)
    this.position = WindowPosition(Alignment.Center)
    this.isMaximized = false

    return this
}
