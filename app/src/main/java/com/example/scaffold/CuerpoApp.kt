package com.example.scaffold

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


@Composable
fun CuerpoApp(modifier: Modifier = Modifier, color: Color, texto: String) {
    Column(
        modifier = modifier
            .background(color = color)
            .fillMaxSize()
    ) {
        ImagenDesdeUrl("https://picsum.photos/400")
    }
}

@Composable
fun ImagenDesdeUrl(imagenUrl: String) {
    Log.d("URL", imagenUrl)
    AsyncImage(
        model = imagenUrl,
        contentDescription = "imagen",
        error = painterResource(R.drawable.ic_launcher_background),
       modifier = Modifier.fillMaxSize()
    )
}









