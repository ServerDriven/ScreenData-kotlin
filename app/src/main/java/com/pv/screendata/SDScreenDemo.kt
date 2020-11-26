package com.pv.screendata

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.screens.SomeScreen

@Composable
fun SDSCreen(
    screen: SomeScreen,
    navController: NavController? = null // TODO:  Decide if nullable
) {
    Scaffold(
        Modifier.fillMaxSize(),
        backgroundColor = Color(
            screen.backgroundColor.red,
            screen.backgroundColor.green,
            screen.backgroundColor.blue
        ),
        topBar = {
            TopAppBar(title = {
                Text(screen.title)
            })
        },
    ) {
        SDSomeView(someView = screen.someView, navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
fun sdScreenPreview() {
    SDScreenDemo.mock()
}

object SDScreenDemo {
    @Composable
    fun mock() = SDSCreen(
        screen = MockScreens.basic
    )
}