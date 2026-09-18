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
fun PreviewSegundaTela(){
    SegundaTela(rememberNavController())
}

@Composable
fun SegundaTela(navController: NavController){
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
                // voltar uma tela
                navController.popBackStack()
            }
        ) {
            Text(
                "VOLTAR <-"
            )
        }
    }
}