package com.example.mobiledeveloping

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Filled.FavoriteBorder,
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("My First App")
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar {
                Icon(
                    imageVector = Icons.Filled.DateRange,
                    contentDescription = "Календарь",
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.weight(1f, true))
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "Главная",
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.weight(1f, true))
                Icon(
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = "Профиль",
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }
        },
        content = { paddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
                Text(
                    text = "Hello! That's your last chats",
                    fontFamily = FontFamily.Default,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(16.dp)
                )

                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(10) { index ->
                        ChatItem(index)
                    }
                }
            }
        }
    )
}

@Composable
fun ChatItem(index: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(Color.Gray)
        )
        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(
                text = "Chat number $index",
                fontFamily = FontFamily.Monospace,
                fontSize = 16.sp
            )
            Text(
                text = "That a simple example for chat number $index. I just want to see this text on two lines so that you can try to make a restriction",
                fontSize = 14.sp,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview
@Composable
private fun preview() {
    SecondScreen()
}