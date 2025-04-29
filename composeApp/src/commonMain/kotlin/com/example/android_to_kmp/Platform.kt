package com.example.android_to_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform