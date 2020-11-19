package com.pv.screendata.viewsamples

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.ui.shapes
import com.pv.screendata.views.SomeLabel

@Composable
fun SDLabel(label: SomeLabel) {
    Column {
        Text(
            text = label.title,
            fontSize = 16.sp
        )
        label.subtitle?.let {
            Text(text = it, fontSize = 12.sp)
        }
    }
}

@Preview
@Composable
fun sdLabelPreview() {
    SDLabel(label = SDLabel.mock)
}

object SDLabel {

    val mock = SomeLabel(
        id = "sdLabelId",
        title = "Just the main Title",
        subtitle = "Just a subtitle",
        someStyle = null,
        destination = null
    )
}
