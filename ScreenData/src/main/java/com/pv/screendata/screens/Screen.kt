package com.pv.screendata.screens

import com.pv.screendata.objects.Color
import com.pv.screendata.objects.SomeView

data class Screen(
    val id: String?,
    val title: String,
    val subtitle: String?,
    val backgroundColor: Color,
    val headerView: SomeView?,
    val view: SomeView,
    val footerView: SomeView?
)
