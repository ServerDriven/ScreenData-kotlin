package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewType

data class SomeLabel(
    val id: String? = null,
    val title: String,
    val subtitle: String? = null,
    val someStyle: SomeStyle? = null,
    val destination: Destination? = null
) {
    val type: ViewType = ViewType.label
}
