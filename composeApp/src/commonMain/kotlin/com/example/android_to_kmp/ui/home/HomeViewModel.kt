package com.example.android_to_kmp.ui.home

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class HomeViewModel {
    private val _text = mutableStateOf("Hi! This is home Fragment")
    val text by _text
}