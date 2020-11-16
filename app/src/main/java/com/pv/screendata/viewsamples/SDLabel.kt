package com.pv.screendata.viewsamples

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.objects.SomeView
import com.pv.screendata.views.Label

@Composable
fun SDLabel(label: Label) {
    Column {
        Text(text = label.title)
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

    val mock = Label(
        id = "sdLabelId",
        title = "Just the main Title",
        subtitle = "Just a subtitle",
        style = null,
        destination = null
    )
}
