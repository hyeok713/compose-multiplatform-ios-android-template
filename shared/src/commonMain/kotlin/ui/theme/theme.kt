package ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.intl.Locale
import ui.color.ColorMode
import values.stringResourcesEn
import values.stringResourcesKo


private val DarkColorScheme = darkColorScheme(
    primary = Color.Yellow,
    secondary = Color.Yellow,
    tertiary = Color.Yellow
)

private val LightColorScheme = lightColorScheme(
    primary = Color.Green,
    secondary = Color.Green,
    tertiary = Color.Green

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

val LocalStringResources = staticCompositionLocalOf { stringResourcesEn() }

@Composable
fun ApplicationTheme(
    colorMode: ColorMode,
    content: @Composable () -> Unit) {
    val stringResources = when (Locale.current.language.uppercase()) {
        "KO" -> stringResourcesKo()
        else -> stringResourcesEn() /* default */
    }

    val colorScheme = when (colorMode) {
        ColorMode.DARK -> DarkColorScheme
        ColorMode.LIGHT -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme
    ) {
        CompositionLocalProvider(LocalStringResources provides stringResources) {
            content()
        }
    }
}