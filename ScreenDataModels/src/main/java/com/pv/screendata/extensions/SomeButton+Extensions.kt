package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeButton

fun SomeButton.toSomeView(): SomeView = SomeView(
    type = ViewType.button,
    someButton = this,
)
