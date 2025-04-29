package com.example.android_to_kmp.ui.navigation

import com.example.android_to_kmp.ui.resources.Strings

sealed class Screen(val route: String, val resourceId: String, val labelId: String) {
    object Home : Screen("home", "ic_home_black_24dp", Strings.title_home)
    object Dashboard : Screen("dashboard", "ic_dashboard_black_24dp", Strings.title_dashboard)
    object Notifications : Screen("notifications", "ic_notifications_black_24dp", Strings.title_notifications)
}