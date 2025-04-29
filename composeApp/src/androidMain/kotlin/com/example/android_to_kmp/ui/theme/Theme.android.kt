package com.example.android_to_kmp.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.foundation.isSystemInDarkTheme as androidIsSystemInDarkTheme

@Composable
actual fun isSystemInDarkTheme(): Boolean = androidIsSystemInDarkTheme()