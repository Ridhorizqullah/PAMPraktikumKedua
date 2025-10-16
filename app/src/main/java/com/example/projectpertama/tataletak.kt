package com.example.projectpertama

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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

annotation class composable

@composable
fun TataletakRow(modifier: Modifier){
    Row (modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly){
        Text(text = "Komponen 1")
        Text(text = "Komponen 2")
        Text(text = "Komponen 3")
        Text(text = "Komponen 4")
    }

}

@composable
fun TataletakBox(modifier: Modifier){
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center
    )   {
        Text(text = "Komponen 1")
        Text(text = "Komponen 2")
        Text(text = "Komponen 3")
        Text(text = "Komponen 4")


    }
}

@composable
fun TataletakColumnRow(modifier: Modifier) {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Text(text = "Komponen baris 1")
            Text(text = "Komponen baris 2")
            Text(text = "Komponen baris 3")
            Text(text = "Komponen baris 4")
        }
        Row(
            Modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen baris 5")
            Text(text = "Komponen baris 6")
            Text(text = "Komponen baris 7")
            Text(text = "Komponen baris 8")

        }
    }
}

 @composable
fun TataletakRowColumn(modifier: Modifier) {
    Row (modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Column(){
            Text(text = "Komponen baris 1")
            Text(text = "Komponen baris 2")
            Text(text = "Komponen baris 3")
            Text(text = "Komponen baris 4")
        }
        Column(){
            Text(text = "Komponen baris 5")
            Text(text = "Komponen baris 6")
            Text(text = "Komponen baris 7")
            Text(text = "Komponen baris 8")
        }

    }
 }