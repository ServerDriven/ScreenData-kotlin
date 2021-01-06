package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ViewType

// Runs action before destination
data class SomeButton(
    val id: String? = null,
    val actionId: String? = null,
    val title: String,
    val destination: Destination? = null,
    val someStyle: SomeStyle? = null
) {
    val type: ViewType = ViewType.button
}