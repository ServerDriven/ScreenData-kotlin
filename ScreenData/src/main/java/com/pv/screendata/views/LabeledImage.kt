package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.Style
import com.pv.screendata.types.ViewType

data class LabeledImage(
    val id: String?,
    val title: String,
    val subtitle: String?,
    val image: Image,
    val style: Style?,
    val destination: Destination?
) {
    val type: ViewType = ViewType.labeledImage
}
