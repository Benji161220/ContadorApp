package com.example.contadorapp.ui


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import com.example.contadorapp.ui.theme.ContadorAppTheme

@Composable
fun ContadorApp(
){
    Box(
        modifier = Modifier

    ){
        Column {
            Row{
                Text("Hola")
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text("sumar")
                }
            }
            Row {
                Button(onClick = {
                /*TODO*/ }
            ) {
                    Text("restar")
                }
                Text("Hola")
            }

        }
    }
}

@Preview
@Composable
fun ContadorAppPreview() {
    ContadorAppTheme {
        ContadorApp()
    }
}