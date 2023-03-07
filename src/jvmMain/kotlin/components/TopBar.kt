package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.rememberWindowState

import constants.*

@Composable
fun TopBar() {

    Row(
        modifier = Modifier.fillMaxWidth().height(topBarHeight).background(topBarColor)
    ) {

        Row(
            modifier = Modifier.fillMaxHeight().fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Top
        ) {

            Box(
                modifier = Modifier.size(topBarHeight)
            ) {
                Icon(
                    painter = painterResource("core/icons/minimize_icon.svg"),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Box(
                modifier = Modifier.size(topBarHeight).background(closeButtonColor),
            )

        }

    }

}
