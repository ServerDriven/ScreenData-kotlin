package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewType

data class SomeLabel(
    val id: String?,
    val title: String,
    val subtitle: String?,
    val someStyle: SomeStyle?,
    val destination: Destination?
) {
    val type: ViewType = ViewType.label
}