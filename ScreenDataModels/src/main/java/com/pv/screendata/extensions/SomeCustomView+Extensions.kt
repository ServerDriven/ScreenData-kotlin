package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeCustomView

fun SomeCustomView.toSomeView(): SomeView = SomeView(
    type = ViewType.custom,
    someCustomView = this
)
