package com.example.contadorapp.ui


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.contadorapp.ui.theme.ContadorAppTheme

@Composable
fun ContadorApp(modifier : Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.Center)
){
        Column (modifier = modifier){
            Row{
                Text("Hola",modifier = Modifier.height(140.dp))
            }
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



@Preview
@Composable
fun ContadorAppPreview() {
    ContadorAppTheme {
        ContadorApp()
    }
}