package com.example.happy_birthday.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

// Определите цветовые схемы
private val DarkColorScheme = darkColorScheme(
    // Определите цвета для темной темы, если необходимо
)

private val LightColorScheme = lightColorScheme(
    // Определите цвета для светлой темы, если необходимо
)

@Composable
fun ToYouHappyBirthdayTheme(
    darkTheme: Boolean = false, // Установите, если нужно
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
