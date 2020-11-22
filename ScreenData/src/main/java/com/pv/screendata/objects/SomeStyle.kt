package com.pv.screendata.objects

data class SomeStyle(
    val backgroundColor: SomeColor? = null,
    val foregroundColor: SomeColor? = null,
    val isHidden: Boolean,
    val cornerRadius: Int
)
