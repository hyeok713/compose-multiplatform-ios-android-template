package ui

import platform.UIKit.UIScreen

actual object DeviceDensityProvider {
    actual fun getDensity(): Float {
        val scale = UIScreen.mainScreen.scale
        return scale.toFloat()
    }
}