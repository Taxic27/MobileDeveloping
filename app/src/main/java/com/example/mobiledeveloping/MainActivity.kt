package com.example.mobiledeveloping

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mobiledeveloping.ui.theme.MobileDevelopingTheme
import com.example.mobiledeveloping.ui_components.MainTopBar
import com.example.mobiledeveloping.ui_components.DrawerMenu
import com.example.mobiledeveloping.ui_components.MainListItem
import com.example.mobiledeveloping.ui_components.MainScreen
import com.example.mobiledeveloping.utils.DrawerEvents
import com.example.mobiledeveloping.utils.IdArrayList
import com.example.mobiledeveloping.utils.ListItem
import com.example.mobiledeveloping.utils.Routes
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            var item: ListItem? = null
            MobileDevelopingTheme {
                NavHost(
                    navController = navController,
                    startDestination = Routes.MAIN_SCREEN
                ) {
                    composable(Routes.MAIN_SCREEN) {
                        MainScreen(context = this@MainActivity) { listItem ->
                            navController.navigate(Routes.INFO_SCREEN)
                        }
                    }
                    composable(Routes.INFO_SCREEN) {
                    }
                }
            }
        }
    }
}