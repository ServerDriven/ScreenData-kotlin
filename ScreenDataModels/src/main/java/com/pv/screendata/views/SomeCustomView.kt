package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeView
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType

data class SomeCustomView(
    val id: String, // not sure if it needs to be null entirely.
    val title: String? = null,
    val subtitle: String? = null,
    val style: SomeStyle? = null,
    val someImage: SomeImage? = null,
    val destination: Destination? = null,
    val axis: ViewDirectionAxis? = null,
    val views: List<SomeView>? = null
) {
    val type: ViewType = ViewType.custom
}
