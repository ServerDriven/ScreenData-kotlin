package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeImage

fun SomeImage.toSomeView(): SomeView = SomeView(
    type = ViewType.image,
    someText = null,
    someButton = null,
    someContainer = null,
    someImage = this,
    null,
    null,
    null
)
