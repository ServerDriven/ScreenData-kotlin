package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeContainerView

fun SomeContainerView.toSomeView(): SomeView = SomeView(
    type = ViewType.container,
    someContainer = this,
    someImage = null,
    someLabel = null,
    someLabeledImage = null,
    someCustomView = null,
    someText = null,
    someButton = null
)
