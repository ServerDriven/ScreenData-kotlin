package com.pv.screendata.views

import com.pv.screendata.objects.SomeView
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType

data class SomeContainerView(
    val id: String?,
    val axis: ViewDirectionAxis,
    val views: Array<SomeView>,
    val style: SomeStyle?
) {
    val type: ViewType = ViewType.container
}
