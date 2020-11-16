package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeView
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType

data class SomeCustomView(
    val id: String?,
    val title: String,
    val subtitle: String?,
    val style: SomeStyle?,
    val image: SomeImage?,
    val destination: Destination?,
    val axis: ViewDirectionAxis,
    val views: Array<SomeView>
) {
    val type: ViewType = ViewType.custom
}
