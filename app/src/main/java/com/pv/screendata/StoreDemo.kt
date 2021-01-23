package com.pv.screendata

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.pv.screendata.extensions.toSomeLabel
import com.pv.screendata.extensions.toSomeView

object StoreDemo {

    val mockCustomView = "pogthisisacustomview"
        .toSomeLabel()
        .toSomeView()

    val mockStore = SomeStore(
        customViews = mapOf("pogthisisacustomview" to {
            Text(
                text = "pog o",
                color = Color.Cyan
            )
        })
    )
}

@Preview
@Composable
fun demoCustomView() {
    SDSomeView(someView = StoreDemo.mockCustomView)
}

data class SomeStore(
    val customViews: Map<String, AnyComposable>
)

object SomeStoreHolder {
    var store: SomeStore? = null
}

typealias AnyComposable = @Composable () -> Unit
