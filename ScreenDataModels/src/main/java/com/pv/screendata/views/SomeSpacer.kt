package com.pv.screendata.views

import com.pv.screendata.objects.SomeColor
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType

data class SomeSpacer(
    val axis: ViewDirectionAxis,
    val size: Int
) {
    val type = ViewType.spacer
}
