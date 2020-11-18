package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewType

data class SomeImage(
    val id: String?,
    val url: String,
    val someStyle: SomeStyle?,
    val destination: Destination?
) {
    val type: ViewType = ViewType.image
}
