package com.pv.screendata

import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType
import com.pv.screendata.viewsamples.*

// Todo : find safe fallback on those labels

@Composable
fun SDSomeView(someView: SomeView) {
    when (someView.type) {
        ViewType.label -> {
            SDLabel(label = someView.someLabel!!)
        }
        ViewType.image -> {
            SDImage(image = someView.someImage!!)
        }
        ViewType.labeledImage -> {
            SDLabeledImage(labeledImage = someView.someLabeledImage!!)
        }
        ViewType.container -> {
            SDContainerView(containerView = someView.container!!)
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
        container = SDContainerViewDemo.containerMock(ViewDirectionAxis.vertical),
        null,
        null,
        null,
        null
    )
}
