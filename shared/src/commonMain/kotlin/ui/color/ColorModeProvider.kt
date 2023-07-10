package ui.color

expect object ColorModeProvider {
    fun getColorMode(): ColorMode
}

enum class ColorMode {
    LIGHT, DARK
}