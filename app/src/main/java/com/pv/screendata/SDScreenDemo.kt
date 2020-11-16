package com.pv.screendata

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.extensions.toSomeLabel
import com.pv.screendata.extensions.toSomeView
import com.pv.screendata.objects.SomeColor as SomeColor
import com.pv.screendata.screens.SomeScreen
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.views.SomeContainerView

@Composable
fun SDSCreen(screen: SomeScreen) {
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
        SDSomeView(someView = screen.someView)
    }
}

@Preview(showBackground = true)
@Composable
fun sdScreenPreview() {
    SDSCreen(
        screen = SomeScreen(
            id = "yoloId",
            title = "YoloTitile",
            subtitle = null,
            backgroundColor = SomeColor(
                0,
                188,
                212,
                1
            ),
            headerView = null,
            someView = SomeContainerView(
                id = null,
                axis = ViewDirectionAxis.vertical,
                someViews = arrayOf(
                    "monkaW".toSomeLabel().toSomeView(),
                    "pogs".toSomeLabel().toSomeView(),
                    Pair("Something", "Worse").toSomeLabel().toSomeView(),
                    "Pogs".toSomeLabel().toSomeView()
                ),
                someStyle = null
            ).toSomeView(),
            footerView = null
        )
    )
}
