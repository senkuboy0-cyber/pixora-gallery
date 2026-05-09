package com.pixora.core.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

enum class AppFont(val fontFamily: FontFamily) {
    SYSTEM_DEFAULT(FontFamily.Default),
    INTER(FontFamily.SansSerif), // Placeholder for actual Inter
    POPPINS(FontFamily.Serif), // Placeholder for actual Poppins
    MANROPE(FontFamily.Monospace), // Placeholder for actual Manrope
    PRODUCT_SANS_ALT(FontFamily.SansSerif),
    SF_PRO_ALT(FontFamily.SansSerif)
}

data class PixoraTypography(
    val font: AppFont = AppFont.SYSTEM_DEFAULT,
    val h1: TextStyle = TextStyle(
        fontFamily = font.fontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    val body1: TextStyle = TextStyle(
        fontFamily = font.fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)

object FontEngine {
    private val _currentFont = MutableStateFlow(AppFont.SYSTEM_DEFAULT)
    val currentFont: StateFlow<AppFont> = _currentFont

    fun switchFont(newFont: AppFont) {
        _currentFont.value = newFont
    }
}

val LocalTypography = staticCompositionLocalOf { PixoraTypography() }
