package com.pv.screendata

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.Text
import androidx.compose.material.ListItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageAsset
import androidx.compose.ui.res.stringResource
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType

@Composable
fun SDSomeView(someView: SomeView) {
    when (someView.type) {
        ViewType.label -> {
            Text(text = someView.label?.title ?: "fallback")
        }
        ViewType.image -> {
            Text(text = "A sad image")
        }
        ViewType.labeledImage -> {
            Text(text = "A sad labeled image")
        }
        ViewType.container -> {
            val content = @Composable {
                (0..4).forEach {
                    Text(text = "monkaW")
                }
            }
            when (someView.container?.axis) {
                ViewDirectionAxis.horizontal -> ScrollableRow {
                    content()
                }
                else -> ScrollableColumn {
                    content()
                }
            }
        }
        ViewType.custom -> {
            Text(text = "Will link to a custom")
        }
    }
}

@Preview
@Composable
fun sdSomeViewPreview() {
    SDSomeView(someView = SDSomeViewDemo.mock)
}

object SDSomeViewDemo {

    val mock = SomeView(
        type = ViewType.container,
        null,
        null,
        null,
        null,
        null
    )
}
