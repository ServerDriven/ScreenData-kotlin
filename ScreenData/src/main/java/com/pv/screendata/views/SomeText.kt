package com.pv.screendata.views

import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewType

data class SomeText(
    val id: String?,
    val title: String,
    val style: SomeStyle?,
) {
    val type: ViewType = ViewType.text
}
