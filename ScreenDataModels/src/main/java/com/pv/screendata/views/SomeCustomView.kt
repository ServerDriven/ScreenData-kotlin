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
    val someStyle: SomeStyle?,
    val someImage: SomeImage?,
    val destination: Destination?,
    val axis: ViewDirectionAxis,
    val someViews: Array<SomeView>
) {
    val type: ViewType = ViewType.custom
}
