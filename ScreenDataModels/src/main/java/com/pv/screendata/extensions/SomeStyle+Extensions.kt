package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.Alignment

object SomeStyleHelper {

    fun paddingStyle(size: Int): SomeStyle = SomeStyle(
        isHidden = false,
        cornerRadius = 0,
        padding = size,
        alignment = Alignment.start
    )
}
