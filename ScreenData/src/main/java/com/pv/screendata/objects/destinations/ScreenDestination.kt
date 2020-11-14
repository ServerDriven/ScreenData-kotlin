package com.pv.screendata.objects.destinations

import com.pv.screendata.types.DestinationType

data class ScreenDestination(
    val screenID: String
) {
    val type: DestinationType = DestinationType.screen
}

