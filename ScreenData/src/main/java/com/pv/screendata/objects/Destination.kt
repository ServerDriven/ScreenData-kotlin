package com.pv.screendata.objects

import com.pv.screendata.objects.destinations.DeepLinkDestination
import com.pv.screendata.objects.destinations.ScreenDestination
import com.pv.screendata.objects.destinations.URLDestination
import com.pv.screendata.types.DestinationType

data class Destination(
    val type: DestinationType,
    val screen: ScreenDestination?,
    val url: URLDestination?,
    val deepLink: DeepLinkDestination?
)
