package com.pv.screendata

import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.google.gson.Gson
import com.pv.screendata.extensions.SomeStyleHelper
import com.pv.screendata.extensions.hexToSomeColor
import com.pv.screendata.extensions.toSomeLabel
import com.pv.screendata.extensions.toSomeView
import com.pv.screendata.objects.SomeColor
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.screens.SomeScreen
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.views.SomeContainerView
import com.pv.screendata.views.SomeLabel
import com.pv.screendata.views.SomeSpacer
import com.pv.screendata.views.SomeText
import com.pv.screendata.viewsamples.SDButton
import com.pv.screendata.viewsamples.SDImage

@Preview
@Composable
fun mockScreenPreview() {
    SDSCreen(screen = MockScreens.error)
}

object MockScreens {

    val basic = SomeScreen(
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
                    .copy(someStyle = SomeStyleHelper.paddingStyle(8, 0))
                    .toSomeView(),
                "yea".toSomeLabel()
                    .copy(someStyle = SomeStyleHelper.paddingStyle(8, 0))
                    .toSomeView(),
                SomeSpacer(8).toSomeView(),
                Pair("Something", "Worse")
                    .toSomeLabel()
                    .copy(someStyle = SomeStyleHelper.paddingStyle(8, 0))
                    .toSomeView(),
                SomeSpacer(8).toSomeView(),
                "what".toSomeLabel()
                    .copy(someStyle = SomeStyleHelper.paddingStyle(8, 0))
                    .toSomeView(),
                SomeSpacer(8).toSomeView(),
                Pair(
                    "Something important", """
                        Is this an important piece of informtation or just another bunch of fake news if you read this far then you are a fool lul
                    """.trimIndent()
                ).toSomeLabel()
                    .copy(someStyle = SomeStyleHelper.paddingStyle(8, 8))
                    .toSomeView(),
                SomeSpacer(32).toSomeView(),
                SDButton.mock
                    .copy(
                        someStyle = SomeStyle(
                            isHidden = false,
                            cornerRadius = 4,
                            paddingStart = 8,
                            paddingEnd = 8
                        )
                    )
                    .toSomeView()
            ),
            someStyle = null
        ).toSomeView(),
        footerView = null
    )

    val error = SomeScreen(
        title = "Error",
        backgroundColor = "#d32f2f".hexToSomeColor(),
        someView = SomeContainerView(
            axis = ViewDirectionAxis.vertical,
            someViews = arrayOf(
                SomeLabel(
                    title = "Error loading screen",
                    subtitle = "Could not find lol"
                ).toSomeView()
            )
        ).toSomeView()
    )

    val jsonScreen = Gson().toJson(basic)
}