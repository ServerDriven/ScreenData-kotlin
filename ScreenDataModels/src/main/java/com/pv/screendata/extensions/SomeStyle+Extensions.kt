package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.Alignment

object SomeStyleHelper {

    fun paddingStyle(start: Int, end: Int): SomeStyle = SomeStyle(
        isHidden = false,
        paddingStart = start,
        paddingEnd = end,
        cornerRadius = 0,
        alignment = Alignment.start
    )
}
