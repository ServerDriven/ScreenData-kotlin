package com.pv.screendata.screens

import com.pv.screendata.objects.SomeColor
import com.pv.screendata.objects.SomeView

data class SomeScreen(
    val id: String? = null,
    val title: String,
    val subtitle: String? = null,
    val backgroundColor: SomeColor,
    val headerView: SomeView? = null,
    val someView: SomeView,
    val footerView: SomeView? = null
)
