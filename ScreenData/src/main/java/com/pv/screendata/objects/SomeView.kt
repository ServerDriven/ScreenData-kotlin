package com.pv.screendata.objects

import com.pv.screendata.types.ViewType
import com.pv.screendata.views.*

// preview all models with Some?
// add a spacer view?
data class SomeView(
    val type: ViewType,

    val someText: SomeText?,
    val someButton: SomeButton?,
    val someContainer: SomeContainerView?,
    val someImage: SomeImage?,
    val someLabel: SomeLabel?,
    val someLabeledImage: SomeLabeledImage?,
    val someCustomView: SomeCustomView?
)
