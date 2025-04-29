package com.example.android_to_kmp.ui.notifications

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

class NotificationsViewModel : ViewModel() {
    private val _text = mutableStateOf("This is notifications Fragment")
    val text: State<String> = _text
}