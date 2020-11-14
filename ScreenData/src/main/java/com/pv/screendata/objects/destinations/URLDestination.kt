package com.pv.screendata.objects.destinations

import com.pv.screendata.types.DestinationType

data class URLDestination(
    val url: String
) {
    val type: DestinationType = DestinationType.url
}
