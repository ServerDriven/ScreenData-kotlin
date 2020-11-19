package com.pv.screendata.viewsamples

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.R
import com.pv.screendata.views.SomeImage

// Todo : Not implemented yet boi

@Composable
fun SDImage(image: SomeImage) {
    Image(
        asset = imageResource(id = R.drawable.sample_image),
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview
@Composable
fun sdImagePreview() {
    SDImage(image = SDImage.mock)
}

object SDImage {

    val mock = SomeImage(
        id = "",
        url = "",
        someStyle = null,
        destination = null
    )
}
