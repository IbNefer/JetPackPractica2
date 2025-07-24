package com.example.jetpackpractica2

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TarjetaExpandible(modifier: Modifier) {
    var expandido by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .clickable { expandido = !expandido }
    ) {
        Text(
            text = "Titulo de la tarjeta!",
            fontWeight = FontWeight.Bold
        )

        if (expandido) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Este es el contenido detallado que aparece y desaparece al hacer clic en la tarjeta."
            )
        }
    }
}