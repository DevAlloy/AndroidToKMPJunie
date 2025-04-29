package com.example.android_to_kmp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.android_to_kmp.ui.dashboard.DashboardScreen
import com.example.android_to_kmp.ui.home.HomeScreen
import com.example.android_to_kmp.ui.navigation.Screen
import com.example.android_to_kmp.ui.notifications.NotificationsScreen
import com.example.android_to_kmp.ui.theme.AppTheme
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    AppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            MainScreen()
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun MainScreen() {
    var currentScreen by remember { mutableStateOf<Screen>(Screen.Home) }

    val items = listOf(
        Screen.Home,
        Screen.Dashboard,
        Screen.Notifications
    )

    Scaffold(
        bottomBar = {
            BottomNavigation {
                items.forEach { screen ->
                    BottomNavigationItem(
                        icon = { 
                            Icon(
                                painter = painterResource(screen.resourceId), 
                                contentDescription = null
                            ) 
                        },
                        label = { Text(screen.labelId) },
                        selected = currentScreen == screen,
                        onClick = { currentScreen = screen }
                    )
                }
            }
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier.padding(innerPadding).fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            when (currentScreen) {
                Screen.Home -> HomeScreen()
                Screen.Dashboard -> DashboardScreen()
                Screen.Notifications -> NotificationsScreen()
            }
        }
    }
}
