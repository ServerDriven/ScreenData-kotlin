package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeView
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType

data class SomeCustomView(
    val id: String? = null,
    val title: String,
    val subtitle: String? = null,
    val someStyle: SomeStyle? = null,
    val someImage: SomeImage? = null,
    val destination: Destination? = null,
    val axis: ViewDirectionAxis,
    val someViews: Array<SomeView>
) {
    val type: ViewType = ViewType.custom
}
