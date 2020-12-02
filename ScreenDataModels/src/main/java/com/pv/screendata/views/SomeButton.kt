package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewType

// Runs action before destination
data class SomeButton(
    val id: String?,
    val actionId: String?,
    val title: String,
    val destination: Destination?,
    val style: SomeStyle?
) {
    val type: ViewType = ViewType.button
}
