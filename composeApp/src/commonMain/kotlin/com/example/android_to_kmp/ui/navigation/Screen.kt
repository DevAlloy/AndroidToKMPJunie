package com.example.android_to_kmp.ui.navigation

import android_to_kmp.composeapp.generated.resources.Res
import android_to_kmp.composeapp.generated.resources.ic_dashboard_black_24dp
import android_to_kmp.composeapp.generated.resources.ic_home_black_24dp
import android_to_kmp.composeapp.generated.resources.ic_notifications_black_24dp
import com.example.android_to_kmp.ui.resources.Strings
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
sealed class Screen(val route: String, val resourceId: DrawableResource, val labelId: String) {
    object Home : Screen("home", Res.drawable.ic_home_black_24dp, Strings.title_home)
    object Dashboard : Screen("dashboard", Res.drawable.ic_dashboard_black_24dp, Strings.title_dashboard)
    object Notifications : Screen("notifications", Res.drawable.ic_notifications_black_24dp, Strings.title_notifications)
}
