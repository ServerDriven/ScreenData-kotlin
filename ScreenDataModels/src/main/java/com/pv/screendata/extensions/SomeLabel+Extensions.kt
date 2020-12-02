package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeLabel

fun SomeLabel.toSomeView(): SomeView = SomeView(
    type = ViewType.label,
    someLabel = this,
)

fun String.toSomeLabel(): SomeLabel = SomeLabel(
    title = this,
)

fun Pair<String, String>.toSomeLabel(): SomeLabel = SomeLabel(
    title = first,
    subtitle = second,
)
