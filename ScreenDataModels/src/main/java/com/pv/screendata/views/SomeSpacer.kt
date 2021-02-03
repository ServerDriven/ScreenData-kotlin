package com.pv.screendata.views

import com.pv.screendata.objects.SomeColor
import com.pv.screendata.types.ViewType

data class SomeSpacer(
    val height: Int,
    val width: Int,
    val shouldMaxWidth: Boolean = true,
    val color: SomeColor? = null
) {
    val type = ViewType.spacer
}
