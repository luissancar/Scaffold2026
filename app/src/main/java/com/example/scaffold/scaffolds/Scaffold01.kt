package com.example.scaffold.scaffolds

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer

@Composable
fun Scaffold01() {
    var texto by remember { mutableStateOf("") }
    var color by remember { mutableStateOf(Color.Cyan) }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { MyTopAppBar01(colorCambiado = { color = it }) { texto = it } }
    )
    { innerPadding ->
        CuerpoApp(modifier = Modifier.padding(innerPadding), texto = texto, color = color)

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar01(colorCambiado: (Color) -> Unit, pulsado: (String) -> Unit) {
    TopAppBar(
        modifier = Modifier.windowInsetsPadding(
            insets = WindowInsets.statusBars.only(sides = WindowInsetsSides.Top)
        ),
        title = { Text("TopAppBar") },
        /*  colors = TopAppBarDefaults.topAppBarColors(
              containerColor = Color.Blue,
              titleContentColor = Color.Red
          ),*/
        navigationIcon = { Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu") },
        actions = {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add",
                modifier = Modifier.clickable() {
                    pulsado("Add")
                    colorCambiado(Color.Red)
                })
            Icon(
                imageVector = Icons.Default.AccountBox, contentDescription = "Box",
                modifier = Modifier.clickable() {
                    pulsado("Box")
                    colorCambiado(Color.Blue)
                })
        }


    )
}

@Composable
fun CuerpoApp(modifier: Modifier = Modifier, color: Color, texto: String) {
    Column(modifier = modifier.background(color = color).fillMaxSize()) {
        Text(text = texto)
    }
}