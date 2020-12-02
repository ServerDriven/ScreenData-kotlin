package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeSpacer

fun SomeSpacer.toSomeView(): SomeView = SomeView(
    type = ViewType.spacer,
    someSpacer = this
)
