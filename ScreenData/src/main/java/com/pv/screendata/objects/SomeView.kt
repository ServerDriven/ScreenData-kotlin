package com.pv.screendata.objects

import com.pv.screendata.types.ViewType
import com.pv.screendata.views.*

// preview all models with Some?
// add a spacer view?
data class SomeView(
    val type: ViewType,

    val container: SomeContainerView?,
    val image: SomeImage?,
    val label: SomeLabel?,
    val labeledImage: SomeLabeledImage?,
    val view: SomeCustomView?
)
