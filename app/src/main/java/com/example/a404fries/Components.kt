package com.example.a404fries

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.a404fries.ui.theme.Ink
import com.example.a404fries.ui.theme.WarmBorder

object SaharaTokens {
    val BorderColor = WarmBorder.copy(alpha = 0.6f)
    val BorderWidth = 1.dp
    val CardPadding = 28.dp
    val ButtonShape = RoundedCornerShape(8.dp)
    // CSS: 0 2px 16px rgba(58,48,42,.04) — Compose's shadow is a rough approximation
    val ShadowColor = Ink.copy(alpha = 0.04f)
    val ShadowElevation = 12.dp
}

@Composable
fun SaharaPrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = SaharaTokens.ButtonShape,
        elevation = ButtonDefaults.buttonElevation(0.dp, 0.dp, 0.dp, 0.dp, 0.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
        ),
        contentPadding = PaddingValues(horizontal = 24.dp, vertical = 14.dp),
    ) { Text(text, style = MaterialTheme.typography.labelLarge) }
}

@Composable
fun SaharaSecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = SaharaTokens.ButtonShape,
        border = BorderStroke(SaharaTokens.BorderWidth, MaterialTheme.colorScheme.outline),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.onBackground),
        contentPadding = PaddingValues(horizontal = 24.dp, vertical = 14.dp),
    ) { Text(text, style = MaterialTheme.typography.labelLarge) }
}

// Touch has no hover, so links are underlined at rest.
@Composable
fun SaharaTextLink(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    TextButton(onClick = onClick, modifier = modifier) {
        Text(
            text,
            style = MaterialTheme.typography.labelLarge.copy(textDecoration = TextDecoration.Underline),
            color = MaterialTheme.colorScheme.primary,
        )
    }
}

@Composable
fun SaharaCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Surface(
        modifier = modifier.shadow(
            elevation = SaharaTokens.ShadowElevation,
            shape = MaterialTheme.shapes.large,
            ambientColor = SaharaTokens.ShadowColor,
            spotColor = SaharaTokens.ShadowColor,
        ),
        shape = MaterialTheme.shapes.large,
        color = MaterialTheme.colorScheme.surfaceContainerLowest, // warm white
        border = BorderStroke(SaharaTokens.BorderWidth, SaharaTokens.BorderColor),
    ) {
        Column(Modifier.padding(SaharaTokens.CardPadding)) { content() }
    }
}

@Composable
fun SaharaTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        modifier = modifier,
        singleLine = true,
        shape = SaharaTokens.ButtonShape,
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            focusedBorderColor = MaterialTheme.colorScheme.primary,
            unfocusedBorderColor = MaterialTheme.colorScheme.outline,
            focusedLabelColor = MaterialTheme.colorScheme.primary,
            cursorColor = MaterialTheme.colorScheme.primary,
        ),
    )
}