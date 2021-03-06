package com.pv.screendata.views

import com.pv.screendata.objects.Destination
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.types.ImageAspectScale
import com.pv.screendata.types.ViewType
import kotlinx.serialization.Serializable

@Serializable
data class SomeImage(
    val id: String? = null,
    val url: String,
    val assetName: String? = null,
    val aspectScale: ImageAspectScale,
    val style: SomeStyle? = null,
    val destination: Destination? = null,

    val idRes: Int? = null // idRes temporary
) {
    val type: ViewType = ViewType.image
}
