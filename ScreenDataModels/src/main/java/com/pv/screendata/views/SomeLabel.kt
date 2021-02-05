package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.FontType
import com.pv.screendata.types.ViewType

// likely can defer to [SomeText.kt]
data class SomeLabel(
    val id: String? = null,
    val title: String,
    val subtitle: String? = null,
    val style: SomeStyle? = null,
    val destination: Destination? = null,
    val font: FontType
// add font
) {
    val type: ViewType = ViewType.label
}
