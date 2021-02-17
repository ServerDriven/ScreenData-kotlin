package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeColor
import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.FontType
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.SomeLabel

fun SomeLabel.toSomeView(): SomeView = SomeView(
    type = ViewType.label,
    someLabel = this,
)

fun String.toSomeLabel(withColor: SomeColor = SomeColor(0f, 0f, 0f, 1f)): SomeLabel = SomeLabel(
    title = this,
    font = FontType.body
)

fun Pair<String, String>.toSomeLabel(): SomeLabel = SomeLabel(
    title = first,
    subtitle = second,
    font = FontType.body
)
