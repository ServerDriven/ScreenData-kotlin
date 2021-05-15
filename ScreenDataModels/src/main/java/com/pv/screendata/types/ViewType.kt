package com.pv.screendata.types

import kotlinx.serialization.Serializable

@Serializable
enum class ViewType {
    text,
    button,
    label,
    image,
    container,
    custom,
    spacer
}
