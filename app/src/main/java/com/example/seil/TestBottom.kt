package com.example.seil

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

public class TestBottom {
    @Composable
    fun teste(){
        Button(onClick = { println("testando botao") }) {
            Text(text = "Entrar")
        }
    }

}