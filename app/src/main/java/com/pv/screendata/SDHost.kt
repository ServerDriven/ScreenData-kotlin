package com.pv.screendata

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pv.screendata.screens.SomeScreen

@Composable
fun SDHost(forScreen: SomeScreen) {

    val nav = rememberNavController()

    NavHost(
        navController = nav,
        startDestination = "home"
    ) {

        composable("home") {
            SDSCreen(screen = forScreen, navController = nav)
        }

        composable(
            "error"
        ) {
//            val screen = it.arguments?.getSerializable("serverData") as? SomeScreen
            SDSCreen(screen = MockScreens.error)
        }
    }
    println()
}
