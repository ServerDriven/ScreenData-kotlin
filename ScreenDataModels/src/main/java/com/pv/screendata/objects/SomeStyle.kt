package com.pv.screendata.objects

import com.pv.screendata.types.Alignment

data class SomeStyle(
    val backgroundColor: SomeColor? = null,
    val foregroundColor: SomeColor? = null,
    val isHidden: Boolean,
    val cornerRadius: Int,
    val paddingStart: Int = 0,
    val paddingEnd: Int = 0, // default 0 instead null for padding ?,
    val alignment: Alignment
)
