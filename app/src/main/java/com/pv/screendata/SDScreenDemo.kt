package com.pv.screendata

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.TextButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.objects.Color
import com.pv.screendata.objects.SomeView
import com.pv.screendata.screens.Screen
import com.pv.screendata.types.ViewType

@Composable
fun SDSCreen(screen: Screen) {
    Scaffold(
        Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(title = {
                Text(screen.title)
            })
        },
    ) {

    }
}

@Preview
@Composable
fun sdScreenPreview() {
    SDSCreen(
        screen = Screen(
            id = "yoloId",
            title = "YoloTitile",
            subtitle = null,
            backgroundColor = Color(244, 224, 242, 1),
            headerView = null,
            view = SDSomeViewDemo.mock,
            footerView = null
        )
    )
}
