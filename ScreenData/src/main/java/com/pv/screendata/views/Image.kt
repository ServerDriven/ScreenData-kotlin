package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.Style
import com.pv.screendata.types.ViewType

data class Image(
    val id: String?,
    val url: String,
    val style: Style?,
    val destination: Destination?
) {
    val type: ViewType = ViewType.image
}
