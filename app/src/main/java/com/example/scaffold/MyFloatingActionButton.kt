package com.example.scaffold

import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun MyFloatingActionButton(onCLick: (String) -> Unit) {
    FloatingActionButton(
        onClick = {
            val randomSize = (1..1000).random()
            onCLick("https://picsum.photos/$randomSize")
            Log.d("FAB", "https://picsum.photos/$randomSize")
        },
        containerColor = Color.Red,
        contentColor = Color.White
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add"
        )
    }
}