package com.pv.screendata.views

import com.pv.screendata.objects.SomeColor
import com.pv.screendata.types.ViewType

data class SomeSpacer(
    val height: Int,
    val width: Int,
    val color: SomeColor
) {
    val type = ViewType.spacer
}
