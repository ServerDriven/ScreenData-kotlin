package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeStyle

object SomeStyleHelper {

    fun paddingStyle(start: Int, end: Int): SomeStyle = SomeStyle(
        isHidden = false,
        paddingStart = start,
        paddingEnd = end,
        cornerRadius = 0
    )
}
