package com.pv.screendata

import androidx.compose.ui.graphics.Color
import com.pv.screendata.objects.SomeColor

fun SomeColor.toComposeColor(): Color = Color(red, green, blue)