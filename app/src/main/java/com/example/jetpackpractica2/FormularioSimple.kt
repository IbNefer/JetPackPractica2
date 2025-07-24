package com.example.jetpackpractica2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun FormularioSimple(modifier: Modifier){
    var texto by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = texto,
            onValueChange = {texto = it},
            label = {Text(text = "Ingresar un texto")}
        )
        Button(onClick = {},
            enabled = texto.isNotEmpty()
        ) {
             Text(text = "Enviar")
        }
    }
}