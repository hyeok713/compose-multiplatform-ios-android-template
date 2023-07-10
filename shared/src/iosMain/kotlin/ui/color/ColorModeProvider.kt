package ui.color

import platform.UIKit.UITraitCollection
import platform.UIKit.UIUserInterfaceStyle
import platform.UIKit.currentTraitCollection

actual object ColorModeProvider {
    actual fun getColorMode(): ColorMode {
        val currentTraitCollection = UITraitCollection.currentTraitCollection
        return if (currentTraitCollection.userInterfaceStyle == UIUserInterfaceStyle.UIUserInterfaceStyleDark) {
            ColorMode.DARK
        } else {
            ColorMode.LIGHT
        }
    }
}