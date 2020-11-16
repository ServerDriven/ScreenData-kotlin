package com.pv.screendata.viewsamples

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.ScrollableRow
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.SDSomeView
import com.pv.screendata.extensions.toSomeView
import com.pv.screendata.objects.SomeView
import com.pv.screendata.types.ViewDirectionAxis
import com.pv.screendata.types.ViewType
import com.pv.screendata.views.ContainerView

@Composable
fun SDContainerView(containerView: ContainerView) {
    val content = @Composable {
        containerView.views.forEach {
            SDSomeView(someView = it)
        }
    }

    when (containerView.axis) {
        ViewDirectionAxis.horizontal -> ScrollableRow {
            content()
        }
        ViewDirectionAxis.vertical -> ScrollableColumn {
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
        ContainerView(
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
