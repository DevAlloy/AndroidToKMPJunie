package com.example.android_to_kmp.ui.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import com.example.android_to_kmp.ui.dashboard.DashboardViewModel
import com.example.android_to_kmp.ui.home.HomeViewModel
import com.example.android_to_kmp.ui.notifications.NotificationsViewModel

@Composable
inline fun <reified VM : ViewModel> createViewModel(): VM {
    return remember {
        when (VM::class) {
            HomeViewModel::class -> HomeViewModel()
            DashboardViewModel::class -> DashboardViewModel()
            NotificationsViewModel::class -> NotificationsViewModel()
            else -> throw IllegalArgumentException("Unknown ViewModel class: ${VM::class}")
        }
    } as VM
}