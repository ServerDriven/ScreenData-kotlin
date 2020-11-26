package com.pv.screendata

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pv.screendata.screens.SomeScreen

@Composable
fun SDHost(forScreen: SomeScreen) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable("home") {
            SDSCreen(screen = forScreen, navController = navController)
        }

        composable(
            "someScreen/{serverData}"
        ) {
            val screen = it.arguments?.getSerializable("serverData") as? SomeScreen
        }
    }
}
