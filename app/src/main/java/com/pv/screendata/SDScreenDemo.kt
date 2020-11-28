package com.pv.screendata

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.mock.MockScreens
import com.pv.screendata.screens.SomeScreen

@Composable
fun SDSCreen(
    screen: SomeScreen,
    navController: NavController? = null // TODO:  Decide if nullable
) {

    // todo : needs to be modified to handle no screen state
    Scaffold(
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
    SDSCreen(
        screen = MockScreens.basic
    )
}
