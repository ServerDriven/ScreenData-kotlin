package com.pv.screendata.objects

import kotlinx.serialization.Serializable

@Serializable
data class SomeStyle(
    val backgroundColor: SomeColor? = null,
    val foregroundColor: SomeColor? = null,
    val isHidden: Boolean = false,
    val cornerRadius: Int = 0,
    val padding: Int = 0,
    val height: Int = 0
)
