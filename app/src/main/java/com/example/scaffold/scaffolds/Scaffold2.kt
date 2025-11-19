package com.example.scaffold.scaffolds

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Scaffold02() {
    val snackbarHostState = SnackbarHostState()

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        topBar = { MyTopAppBar2() }
    ) { contentPadding ->
        CuerpoApp(
            modifier = Modifier.padding(paddingValues = contentPadding),
            color = Color.Red,
            texto = "TopAppBar2"
        )

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar2() {
    TopAppBar(
        modifier = Modifier.windowInsetsPadding(
            insets = WindowInsets.statusBars.only(WindowInsetsSides.Top)
        ),
        title = { Text("topappbar2") },
        navigationIcon = {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
        },
        uiuhiuhihiuiuhiuhiu
        )


}
