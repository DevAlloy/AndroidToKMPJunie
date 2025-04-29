package com.example.android_to_kmp.ui.dashboard

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class DashboardViewModel {
    private val _text = mutableStateOf("This is dashboard Fragment")
    val text by _text
}