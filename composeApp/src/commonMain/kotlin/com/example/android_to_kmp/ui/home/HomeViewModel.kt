package com.example.android_to_kmp.ui.home

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

class HomeViewModel : ViewModel() {
    private val _text = mutableStateOf("Hi! This is home Fragment")
    val text: State<String> = _text
}