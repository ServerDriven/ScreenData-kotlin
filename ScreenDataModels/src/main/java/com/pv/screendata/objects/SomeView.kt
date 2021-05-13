package com.pv.screendata.objects

import com.pv.screendata.types.ViewType
import com.pv.screendata.views.*
import kotlinx.serialization.Serializable

@Serializable
data class SomeView(
    val type: ViewType,

    val someText: SomeText? = null,
    val someButton: SomeButton? = null,
    val someContainer: SomeContainerView? = null,
    val someImage: SomeImage? = null,
    val someLabel: SomeLabel? = null,
    val someCustomView: SomeCustomView? = null,
    val someSpacer: SomeSpacer? = null
)
