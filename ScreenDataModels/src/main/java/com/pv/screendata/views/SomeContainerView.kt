package com.pv.screendata.views

import com.pv.screendata.objects.SomeView
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType
import kotlinx.serialization.Serializable

@Serializable
data class SomeContainerView(
    val id: String? = null,
    val axis: ViewDirectionAxis,
    val views: List<SomeView>,
    val style: SomeStyle? = null,
    val isScrollable: Boolean = true
) {
    val type: ViewType = ViewType.container
}
