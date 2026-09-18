package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(){
    // controller
    val navController = rememberNavController()

    // rotas
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable ("home") {
            // Abrir tela principal
            TelaPrincipal(navController)
        }

        composable ("segundaTela") {
            // Abrir a segunda tela
            SegundaTela(navController)
        }
    }
}
