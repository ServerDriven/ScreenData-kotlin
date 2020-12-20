package com.pv.screendata

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.extensions.SomeStyleHelper.paddingStyle
import com.pv.screendata.extensions.toSomeLabel
import com.pv.screendata.extensions.toSomeView
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.objects.SomeView
import com.pv.screendata.objects.SomeColor as SomeColor
import com.pv.screendata.screens.SomeScreen
import com.pv.screendata.types.Alignment
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeContainerView
import com.pv.screendata.views.SomeImage
import com.pv.screendata.views.SomeSpacer
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
            TopAppBar(
                title = {
                    Text(
                        screen.title,
                        color = Color.White
                    )
                },
                backgroundColor = screen.toolbarColor.toComposeColor()
            )
        },
    ) {
        SDSomeView(someView = screen.someView)
    }
}

@Preview(showBackground = true)
@Composable
fun sdScreenPreview() {
    SDScreenDemo.mock2
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
                    SomeSpacer(8).toSomeView(),
                    "what".toSomeLabel()
                        .copy(someStyle = paddingStyle(8, 0))
                        .toSomeView(),
                    "yea".toSomeLabel()
                        .copy(someStyle = paddingStyle(8, 0))
                        .toSomeView(),
                    SomeSpacer(8).toSomeView(),
                    Pair("Something", "Worse")
                        .toSomeLabel()
                        .copy(someStyle = paddingStyle(8, 0))
                        .toSomeView(),
                    SomeSpacer(8).toSomeView(),
                    "what".toSomeLabel()
                        .copy(someStyle = paddingStyle(8, 0))
                        .toSomeView(),
                    SomeSpacer(8).toSomeView(),
                    Pair(
                        "Something important", """
                        Is this an important piece of informtation or just another bunch of fake news if you read this far then you are a fool lul
                    """.trimIndent()
                    ).toSomeLabel()
                        .copy(someStyle = paddingStyle(8, 8))
                        .toSomeView(),
                    SomeSpacer(32).toSomeView(),
                    SDButton.mock
                        .copy(
                            someStyle = SomeStyle(
                                isHidden = false,
                                cornerRadius = 4,
                                paddingStart = 8,
                                paddingEnd = 8,
                                alignment = Alignment.center
                            )
                        )
                        .toSomeView()
                ),
                someStyle = null
            ).toSomeView(),
            footerView = null
        )
    )

    val mock2 = SomeScreen(
        title = "Welcome",
        backgroundColor = SomeColor(
            0f,
            0f,
            0f,
            1f
        ),
        someView = SomeView(
            type = ViewType.container,
            someContainer = SomeContainerView(
                axis = ViewDirectionAxis.vertical,
                someViews = arrayOf(
                    SomeView(
                        type = ViewType.image,
                        someImage = SomeImage(url = "monkawW")
                    ),
                    "Tours".toSomeLabel(
                        withColor = SomeColor(
                            102f / 255f,
                            187f / 255f,
                            106f / 255f,
                            .1f
                        )
                    ).toSomeView(),
                ),
            )
        )
    )
}