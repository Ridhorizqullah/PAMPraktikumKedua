package com.example.projectpertama

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@composable
fun TataletakColumn(modifier: Modifier){
    column(modifier = modifier.padding(all=20.dp)) {
        Text(text = "Komponen 1")
        Text(text = "Komponen 2")
        Text(text = "Komponen 3")
        Text(text = "Komponen 4")
    }
}
