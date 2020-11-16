package com.pv.screendata.objects

import com.pv.screendata.types.DestinationType

data class Destination(
    val toId: String,
    val type: DestinationType,
)
