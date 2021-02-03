package com.pv.screendata.views

import com.pv.screendata.objects.SomeView
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType

data class SomeContainerView(
    val id: String? = null,
    val axis: ViewDirectionAxis,
    val views: List<SomeView>,
    val someStyle: SomeStyle? = null
) {
    val type: ViewType = ViewType.container
}
