package com.example.scaffold.scaffolds

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.scaffold.CuerpoApp

@Composable
fun Scaffold3() {
    var color by remember { mutableStateOf(Color.Blue) }

    Scaffold(
        bottomBar = {
            BottomBar3() {
                color = it
            }
        })
    { contentPadding ->
        CuerpoApp(
            modifier = Modifier.padding(paddingValues = contentPadding),
            color = color,
            texto = "Scaffold3",



        )
    }
}

@Composable
fun BottomBar3(onColorChange: (Color) -> Unit) {
    var index by rememberSaveable { mutableStateOf(1) }

    NavigationBar() {
        NavigationBarItem(
            selected = index == 1,
            onClick = {
                index = 1
                onColorChange(Color.Red)
            },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "Home"
                )
            },
            label = { Text("Home") }
        )
        NavigationBarItem(
            selected = index == 2,
            onClick = {
                index = 2
                onColorChange(Color.Green)
            },
            icon = {
                Icon(
                    imageVector = Icons.Filled.AccountBox,
                    contentDescription = "Account"
                )
            },
            label = { Text("Account") }
        )
        NavigationBarItem(
            selected = index == 3,
            onClick = {
                index = 3
                onColorChange(Color.Yellow)

            },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Build,
                    contentDescription = "Build"
                )
            },
            label = { Text("Build") }
        )

    }


}


@Composable
fun ImagenDesdeUrl(imagen: String) {
    AsyncImage(
        model = imagen,
        contentDescription = "Mi imagen",
        modifier = Modifier.size(120.dp)
    )
}






