package com.example.a404fries.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val SaharaColors = lightColorScheme(
    primary = Sienna,
    onPrimary = WarmWhite,
    primaryContainer = SiennaContainer,
    onPrimaryContainer = Ink,
    tertiary = DustyRose,
    onTertiary = WarmWhite,
    tertiaryContainer = RoseContainer,
    onTertiaryContainer = Ink,
    background = Linen,
    onBackground = Ink,
    surface = Linen,
    onSurface = Ink,
    surfaceVariant = WarmSurface,
    onSurfaceVariant = InkMuted,
    surfaceContainerLowest = WarmWhite,
    surfaceContainerLow = WarmSurfaceLow,
    surfaceContainer = WarmSurface,
    outline = WarmBorder,
    outlineVariant = WarmBorder.copy(alpha = 0.6f),
    scrim = Ink,
)

private val SaharaShapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(8.dp),
    large = RoundedCornerShape(12.dp),
)

@Composable
fun SaharaTheme(content: @Composable () -> Unit) {
    // Light-only on purpose: the palette is warm linen. No dynamic color, no dark scheme.
    MaterialTheme(
        colorScheme = SaharaColors,
        typography = SaharaTypography,
        shapes = SaharaShapes,
        content = content,
    )
}