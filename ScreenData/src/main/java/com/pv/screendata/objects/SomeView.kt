package com.pv.screendata.objects

import com.pv.screendata.types.ViewType
import com.pv.screendata.views.*

data class SomeView(
    val type: ViewType,

    val container: ContainerView?,
    val image: Image?,
    val label: Label?,
    val labeledImage: LabeledImage?,
    val view: View?
)
