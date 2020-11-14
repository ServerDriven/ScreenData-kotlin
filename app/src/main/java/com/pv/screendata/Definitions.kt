package com.pv.screendata

import androidx.compose.ui.graphics.Color

data class SDScreen(
    val title: String,
    val subtitle: String?,
    val backgroundColor: Color,
    val headerView: SDView?,
    val views: Array<SDView>,
    val footerView: SDView?
)

data class SDView(
    val type: SDViewType
)

enum class SDViewType {
    
}
