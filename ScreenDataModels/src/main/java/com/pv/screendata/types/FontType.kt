package com.pv.screendata.types

import kotlinx.serialization.Serializable

@Serializable
enum class FontType {
    largeTitle,
    title,
    headline,
    body,
    footnote,
    caption
}
