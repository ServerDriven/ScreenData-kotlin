package com.pv.screendata.objects

import com.pv.screendata.types.DestinationType
import kotlinx.serialization.Serializable

@Serializable
data class Destination(
    val toID: String,
    val type: DestinationType,
)
