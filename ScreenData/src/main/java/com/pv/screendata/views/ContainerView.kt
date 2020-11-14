package com.pv.screendata.views

import com.pv.screendata.objects.SomeView
import com.pv.screendata.objects.Style
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType

data class ContainerView(
    val id: String?,
    val axis: ViewDirectionAxis,
    val views: Array<SomeView>,
    val style: Style?
) {
    val type: ViewType = ViewType.container
}
