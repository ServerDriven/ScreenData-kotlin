package com.pv.screendata.objects

import com.pv.screendata.types.Alignment

data class SomeStyle(
    val backgroundColor: SomeColor? = null,
    val foregroundColor: SomeColor? = null,
    val isHidden: Boolean = false,
    val cornerRadius: Int,
    val paddingStart: Int = 0,
    val paddingEnd: Int = 0,
    val height: Int? = null,
    val width: Int? = null,
    val alignment: Alignment
)
