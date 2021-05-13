package com.pv.screendata.objects

import kotlinx.serialization.Serializable

@Serializable
data class SomeColor(
    val red: Float,
    val green: Float,
    val blue: Float,
    val alpha: Float
)
