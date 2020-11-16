package com.pv.screendata.viewsamples

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.SDSomeView
import com.pv.screendata.extensions.toSomeView
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.views.SomeContainerView

@Composable
fun SDContainerView(containerView: SomeContainerView) {
    val content = @Composable {
        containerView.views.forEach {
            SDSomeView(someView = it)
        }
    }

    when (containerView.axis) {
        ViewDirectionAxis.horizontal -> ScrollableRow(modifier = Modifier.fillMaxWidth()) {
            content()
        }
        ViewDirectionAxis.vertical -> ScrollableColumn(modifier = Modifier.fillMaxWidth()) {
            content()
        }
    }
}

@Preview
@Composable
fun sdContainerViewPreview() {
    SDContainerView(containerView = SDContainerViewDemo.containerMock(ViewDirectionAxis.vertical))
}

object SDContainerViewDemo {

    val containerMock = { axis: ViewDirectionAxis ->
        SomeContainerView(
            id = "someContainerId",
            axis = axis,
            views = arrayOf(
                SDLabel.mock.toSomeView(),
                SDLabel.mock.toSomeView(),
                SDLabel.mock.toSomeView()
            ),
            style = null
        )
    }
}
