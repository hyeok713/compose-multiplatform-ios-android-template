package ui

import android.content.Context

actual object DeviceDensityProvider {
    lateinit var context: Context

    actual fun getDensity(): Float {
        val displayMetrics = context.resources.displayMetrics
        return displayMetrics.density
    }
}