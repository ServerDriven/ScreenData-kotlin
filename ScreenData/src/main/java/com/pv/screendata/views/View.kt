package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeView
import com.pv.screendata.objects.Style
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType

data class View(
    val id: String?,
    val title: String,
    val subtitle: String?,
    val style: Style?,
    val image: Image?,
    val destination: Destination?,
    val axis: ViewDirectionAxis,
    val views: Array<SomeView>
) {
    val type: ViewType = ViewType.custom
}
