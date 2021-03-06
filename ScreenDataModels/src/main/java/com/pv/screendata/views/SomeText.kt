package com.pv.screendata.views

import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewType
import kotlinx.serialization.Serializable

@Serializable
data class SomeText(
    val id: String? = null,
    val title: String,
    val style: SomeStyle? = null
) {
    val type: ViewType = ViewType.text
}
