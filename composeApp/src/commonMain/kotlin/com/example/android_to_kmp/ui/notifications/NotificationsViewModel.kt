package com.example.android_to_kmp.ui.notifications

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class NotificationsViewModel {
    private val _text = mutableStateOf("This is notifications Fragment")
    val text by _text
}