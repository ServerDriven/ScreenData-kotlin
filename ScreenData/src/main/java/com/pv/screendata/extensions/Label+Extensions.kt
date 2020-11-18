package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeLabel

fun SomeLabel.toSomeView(): SomeView = SomeView(
    type = ViewType.label,
    someContainer = null,
    someImage = null,
    someLabel = this,
    someLabeledImage = null,
    someCustomView = null,
    someText = null,
    someButton = null
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
