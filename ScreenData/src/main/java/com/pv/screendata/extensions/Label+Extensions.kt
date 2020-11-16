package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeLabel

fun SomeLabel.toSomeView(): SomeView = SomeView(
    type = ViewType.label,
    container = null,
    image = null,
    label = this,
    labeledImage = null,
    view = null
)

fun String.toSomeLabel(): SomeLabel = SomeLabel(
    id = null,
    this,
    null,
    null,
    null
)

fun Pair<String, String>.toSomeLabel(): SomeLabel = SomeLabel(
    id = null,
    title = first,
    subtitle = second,
    null,
    null
)
