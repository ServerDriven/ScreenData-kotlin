package com.pv.screendata.screens

import com.pv.screendata.objects.SomeColor
import com.pv.screendata.objects.SomeView

// should view just be container view ? What screen would have a label ?

data class SomeScreen(
    val id: String?,
    val title: String,
    val subtitle: String?,
    val backgroundColor: SomeColor,
    val headerView: SomeView?,
    val view: SomeView,
    val footerView: SomeView?
)
