package com.pv.screendata.objects.destinations

import com.pv.screendata.types.DestinationType

data class DeepLinkDestination(
    val screenID: Array<String>
) {
    val destinationType: DestinationType = DestinationType.deepLink
}
