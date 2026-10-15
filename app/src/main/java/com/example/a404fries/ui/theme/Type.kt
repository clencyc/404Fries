package com.example.a404fries.ui.theme


import androidx.compose.ui.unit.sp
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.a404fries.R

val EBGaramond = FontFamily(
    Font(R.font.ebgaramond_regular, FontWeight.Normal),
    Font(R.font.ebgaramond_medium, FontWeight.Medium),
)

val Manrope = FontFamily(
    Font(R.font.manrope_regular, FontWeight.Normal),
    Font(R.font.manrope_medium, FontWeight.Medium),
    Font(R.font.manrope_semibold, FontWeight.SemiBold),
)

// Headlines: serif, large, tight leading (~1.1x). Body/labels: Manrope.
val SaharaTypography = Typography(
    displayLarge = TextStyle(fontFamily = EBGaramond, fontWeight = FontWeight.Normal, fontSize = 57.sp, lineHeight = 62.sp, letterSpacing = (-0.5).sp),
    displayMedium = TextStyle(fontFamily = EBGaramond, fontWeight = FontWeight.Normal, fontSize = 45.sp, lineHeight = 50.sp, letterSpacing = (-0.25).sp),
    displaySmall = TextStyle(fontFamily = EBGaramond, fontWeight = FontWeight.Normal, fontSize = 36.sp, lineHeight = 40.sp),
    headlineLarge = TextStyle(fontFamily = EBGaramond, fontWeight = FontWeight.Medium, fontSize = 32.sp, lineHeight = 36.sp),
    headlineMedium = TextStyle(fontFamily = EBGaramond, fontWeight = FontWeight.Medium, fontSize = 28.sp, lineHeight = 32.sp),
    headlineSmall = TextStyle(fontFamily = EBGaramond, fontWeight = FontWeight.Medium, fontSize = 24.sp, lineHeight = 28.sp),
    titleLarge = TextStyle(fontFamily = EBGaramond, fontWeight = FontWeight.Medium, fontSize = 22.sp, lineHeight = 26.sp),
    titleMedium = TextStyle(fontFamily = Manrope, fontWeight = FontWeight.SemiBold, fontSize = 16.sp, lineHeight = 24.sp, letterSpacing = 0.1.sp),
    titleSmall = TextStyle(fontFamily = Manrope, fontWeight = FontWeight.SemiBold, fontSize = 14.sp, lineHeight = 20.sp, letterSpacing = 0.1.sp),
    bodyLarge = TextStyle(fontFamily = Manrope, fontWeight = FontWeight.Normal, fontSize = 16.sp, lineHeight = 26.sp),
    bodyMedium = TextStyle(fontFamily = Manrope, fontWeight = FontWeight.Normal, fontSize = 14.sp, lineHeight = 22.sp),
    bodySmall = TextStyle(fontFamily = Manrope, fontWeight = FontWeight.Normal, fontSize = 12.sp, lineHeight = 18.sp),
    labelLarge = TextStyle(fontFamily = Manrope, fontWeight = FontWeight.SemiBold, fontSize = 14.sp, lineHeight = 20.sp, letterSpacing = 0.2.sp),
    labelMedium = TextStyle(fontFamily = Manrope, fontWeight = FontWeight.Medium, fontSize = 12.sp, lineHeight = 16.sp, letterSpacing = 0.4.sp),
    labelSmall = TextStyle(fontFamily = Manrope, fontWeight = FontWeight.Medium, fontSize = 11.sp, lineHeight = 16.sp, letterSpacing = 0.5.sp),
)