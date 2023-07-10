package ui.color

import android.app.UiModeManager
import android.app.UiModeManager.MODE_NIGHT_YES
import android.content.Context

actual object ColorModeProvider {
    lateinit var context: Context

    actual fun getColorMode(): ColorMode {
        val uiModeManager = context.getSystemService(Context.UI_MODE_SERVICE) as UiModeManager
        return if (uiModeManager.nightMode == MODE_NIGHT_YES) {
            println("nightMode: DARK")
            ColorMode.DARK
        } else {
            println("nightMode: LIGHT")
            ColorMode.LIGHT
        }
    }
}