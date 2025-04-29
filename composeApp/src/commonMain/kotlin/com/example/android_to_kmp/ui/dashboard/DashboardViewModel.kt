package com.example.android_to_kmp.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

class DashboardViewModel : ViewModel() {
    private val _text = mutableStateOf("This is dashboard Fragment")
    val text: State<String> = _text
}