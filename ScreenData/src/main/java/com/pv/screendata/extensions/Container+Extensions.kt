package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.ContainerView

fun ContainerView.toSomeView(): SomeView = SomeView(
    type = ViewType.container,
    container = this,
    image = null,
    label = null,
    labeledImage = null,
    view = null
)
