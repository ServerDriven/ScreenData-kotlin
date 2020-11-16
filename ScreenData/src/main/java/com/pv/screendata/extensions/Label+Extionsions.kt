package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.Label

fun Label.toSomeView(): SomeView = SomeView(
    type = ViewType.label,
    container = null,
    image = null,
    label = this,
    labeledImage = null,
    view = null
)
