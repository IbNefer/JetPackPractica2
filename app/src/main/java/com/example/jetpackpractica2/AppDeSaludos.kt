package com.example.jetpackpractica2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppDeSaludos(modifier: Modifier) {
    var nombre by remember { mutableStateOf("") }
    var saludo by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Ingresa tu nombre") }
        )

        Button(onClick = {
            if (nombre.isNotBlank()) {
                saludo = "¡Hola, $nombre!"
            }
        }) {
            Text("Saludar")
        }

        if (saludo.isNotEmpty()) {
            Text(
                text = saludo,
                fontSize = 24.sp
            )
        }
    }
}