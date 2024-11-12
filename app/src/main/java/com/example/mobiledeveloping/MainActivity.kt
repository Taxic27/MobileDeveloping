package com.example.mobiledeveloping

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobiledeveloping.ui.theme.MobileDevelopingTheme
import com.example.mobiledeveloping.ui_components.MainTopBar
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import com.example.mobiledeveloping.ui_components.DrawerMenu

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val scaffoldState = rememberScaffoldState()
            val topBarTitle = remember {
                mutableStateOf("Грибы")
            }
            MobileDevelopingTheme {
                Scaffold(
                    scaffoldState = scaffoldState,
                    topBar = {
                        MainTopBar(
                            title = topBarTitle.value,
                            scaffoldState
                        )
                    },
                    drawerContent = {
                        DrawerMenu()
                    }
                ) {
                }
            }
        }
    }
}