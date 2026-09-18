package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Preview
@Composable
fun PreviewTelaPrincipal(){
    TelaPrincipal(rememberNavController())
}

@Composable
fun TelaPrincipal(navController: NavController){
    Column() {
        Text(
            ""
        )
        Text(
            ""
        )
        Text(
            ""
        )
        Text(
            ""
        )
        Button(
            onClick = {
                navController.navigate("segundaTela")
            }
        ) {
            Text(
                "Navegar segunda tela"
            )
        }
    }
}