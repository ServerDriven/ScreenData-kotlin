package com.pv.screendata.screens

import com.pv.screendata.objects.SomeColor
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.objects.SomeView
import kotlinx.serialization.Serializable

@Serializable
data class SomeScreen(
    val id: String? = null,
    val title: String,
    val backgroundColor: SomeColor,
    val toolbarColor: SomeColor = SomeColor(0f, 0f, 0f, 1f), // default background black ?
    val headerView: SomeView? = null,
    val someView: SomeView,
    val footerView: SomeView? = null
)
