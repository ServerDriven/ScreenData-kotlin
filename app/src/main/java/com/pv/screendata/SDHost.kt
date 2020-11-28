package com.pv.screendata

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pv.screendata.mock.MockScreens
import com.pv.screendata.screens.SomeScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.onStart

@Composable
fun SDHost(
    forScreen: SomeScreen
) {

    val nav = rememberNavController()

    val flowScreen = SDScreenHandler
        .getScreen("")
        .onStart { delay(2000) }
        .collectAsState(initial = MockScreens.loading)

    NavHost(
        navController = nav,
        startDestination = "home"
    ) {

        composable("home") {
            SDSCreen(screen = flowScreen.value, navController = nav)
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
