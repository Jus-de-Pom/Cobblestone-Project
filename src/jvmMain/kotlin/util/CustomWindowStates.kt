package util

import androidx.compose.ui.window.WindowState

typealias Properties = MutableList<PropertyPair>

private val customWindowStates = mutableMapOf<WindowState, Properties>()

class CustomWindowStates {

    companion object {

        fun setWindowStateProperty(windowState: WindowState, property: PropertyPair) {
            if (!customWindowStates.containsKey(windowState))
                customWindowStates[windowState] = mutableListOf(property)
            else
                customWindowStates[windowState]?.add(property)
        }

        @Suppress("UNCHECKED_CAST")
        fun <T> getWindowStateProperty(windowState: WindowState, key: Any): T? {
            if (!customWindowStates.containsKey(windowState)) {
                println("Key $key wasn't found")
                return null
            }

            val properties = customWindowStates[windowState]
            return properties?.getWithKey(key)?.value as T
        }

    }

}