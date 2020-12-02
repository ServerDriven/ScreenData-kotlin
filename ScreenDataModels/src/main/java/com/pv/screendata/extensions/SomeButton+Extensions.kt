package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeButton

fun SomeButton.toSomeView(): SomeView = SomeView(
    type = ViewType.button,
    someText = null,
    someButton = this,
    someContainer = null,
    someImage = null,
    someLabel = null,
    someLabeledImage = null,
    someCustomView = null
)
