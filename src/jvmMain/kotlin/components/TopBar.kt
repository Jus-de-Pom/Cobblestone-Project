package components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import constants.topBarColor
import constants.topBarHeight

private val iconModifier = Modifier.size(20.dp)

@Composable
fun TopBar() {

    Row(
        modifier = Modifier.fillMaxWidth().height(topBarHeight).background(topBarColor)
    ) {

        Row(
            modifier = Modifier.fillMaxHeight().fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier.size(topBarHeight).clickable {
                    MainWindow.state.isMinimized = !MainWindow.state.isMinimized
                }
            ) {
                Icon(
                    painter = painterResource("core/icons/minimize_icon.svg"),
                    contentDescription = "Minimize Icon",
                    tint = Color.White,
                    modifier = iconModifier.align(Alignment.Center),
                )
            }

            Box(
                modifier = Modifier.size(topBarHeight).clickable {
                    MainWindow.close()
                },
            ) {
                Icon(
                    painter = painterResource("core/icons/close_icon.svg"),
                    contentDescription = "Close Icon",
                    tint = Color.White,
                    modifier = iconModifier.align(Alignment.Center)
                )
            }

        }

    }

}
