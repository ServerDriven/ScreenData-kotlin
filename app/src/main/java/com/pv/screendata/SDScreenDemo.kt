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
import com.pv.screendata.viewsamples.SDButton
import com.pv.screendata.viewsamples.SDImage

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
    SDScreenDemo.mock()
}

object SDScreenDemo {
    @Composable
    fun mock() = SDSCreen(
        screen = SomeScreen(
            id = "yoloId",
            title = "YoloTitile",
            subtitle = null,
            backgroundColor = SomeColor(
                102f / 255f,
                187f / 255f,
                106f / 255f,
                .1f
            ),
            headerView = null,
            someView = SomeContainerView(
                id = null,
                axis = ViewDirectionAxis.vertical,
                someViews = arrayOf(
                    SDImage.mock.toSomeView(),
                    "what".toSomeLabel().toSomeView(),
                    "yea".toSomeLabel().toSomeView(),
                    Pair("Something", "Worse").toSomeLabel().toSomeView(),
                    "what".toSomeLabel().toSomeView(),
                    Pair(
                        "Something important", """
                        Is this an important piece of informtation or just another bunch of fake news if you read this far then you are a fool lul
                    """.trimIndent()
                    ).toSomeLabel().toSomeView(),
                    SDButton.mock.toSomeView()
                ),
                someStyle = null
            ).toSomeView(),
            footerView = null
        )
    )
}