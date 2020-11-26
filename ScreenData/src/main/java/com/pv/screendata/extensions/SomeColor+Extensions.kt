package com.pv.screendata.extensions

import com.pv.screendata.objects.SomeColor

fun String.hexToSomeColor(): SomeColor {
    val hex = this.replace("#", "")

    val red = "${hex[0]}${hex[1]}".toLong(radix = 16).toFloat() / 255
    val green = "${hex[2]}${hex[3]}".toLong(radix = 16).toFloat() / 255
    val blue = "${hex[4]}${hex[5]}".toLong(radix = 16).toFloat() / 255

    return SomeColor(
        red, green, blue, 1f
    )
}
