package com.example.scaffold

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
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
fun CuerpoApp(modifier: Modifier = Modifier, color: Color, texto: String, urlImage: String) {
    Column(
        modifier = modifier
            .background(color = color)
            .fillMaxSize()
    ) {
        ImagenDesdeUrl(urlImage)
    }
}


@Composable
fun ImagenDesdeUrl(imagen: String) {
    val url = if (imagen.isNullOrBlank()) {
        val randomSize = (1..1000).random()
        "https://picsum.photos/$randomSize"

    } else {
        imagen
    }
    AsyncImage(
        model = url,
        contentDescription = "Mi imagen",
        modifier = Modifier.fillMaxSize(),
        onError = { state ->
            Log.e("COIL", "Error al cargar imagen", state.result.throwable)
        }
    )
}













