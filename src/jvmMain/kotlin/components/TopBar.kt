package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

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
                modifier = Modifier.size(topBarHeight).background(minimizeButtonColor)
            )
            Box(
                modifier = Modifier.size(topBarHeight).background(closeButtonColor)
            )

        }

    }

}
