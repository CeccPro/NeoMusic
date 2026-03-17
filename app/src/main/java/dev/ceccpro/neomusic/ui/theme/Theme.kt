package dev.ceccpro.neomusic.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColorScheme(
    primary = CyanAccent,
    onPrimary = Black,
    secondary = CyanAccentDark,
    onSecondary = Black,
    background = Black,
    onBackground = TextWhite,
    surface = DarkGray,
    onSurface = TextWhite,
    surfaceVariant = LightGray,
    onSurfaceVariant = TextGray,
    primaryContainer = LightGray,
    onPrimaryContainer = TextWhite
)

@Composable
fun NeoMusicTheme(content: @Composable () -> Unit) {
    // Solo forzamos el tema oscuro como estilo de la app
    MaterialTheme(
        colorScheme = DarkColorPalette,
        content = content
    )
}
