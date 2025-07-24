package com.example.jetpackpractica2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MensajeSecreto(modifier: Modifier){
    var mostrarMensaje by remember { mutableStateOf(false) }

    Column (
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(onClick = {
            mostrarMensaje = !mostrarMensaje
        }) {
            Text(text = "Revelar secreto!")
        }

        if (mostrarMensaje){
            Text(text = "Te amo mucho")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun prevMensaje(){
    MensajeSecreto(modifier = Modifier)
}