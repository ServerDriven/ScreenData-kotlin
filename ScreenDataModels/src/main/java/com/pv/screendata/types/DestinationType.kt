package com.pv.screendata.types

import kotlinx.serialization.Serializable

@Serializable
enum class DestinationType {
    screen,
    url,
    deepLink
}
