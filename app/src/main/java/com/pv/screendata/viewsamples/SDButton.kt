package com.pv.screendata.viewsamples

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.pv.screendata.objects.SomeColor
import com.pv.screendata.objects.SomeStyle
import com.pv.screendata.toComposeColor
import com.pv.screendata.views.SomeButton

@Composable
fun SDButton(someButton: SomeButton) {

    val cbModifier = Modifier.fillMaxWidth() +
            Modifier.padding(
                start = someButton.style?.paddingStart?.dp ?: 0.dp,
                end = someButton.style?.paddingEnd?.dp ?: 0.dp
            )

    TextButton(
        onClick = {},
        cbModifier,
        shape = RoundedCornerShape(someButton.style?.cornerRadius?.dp ?: 2.dp),
        backgroundColor = someButton.style?.backgroundColor?.toComposeColor() ?: Color.White
    ) {
        Text(
            text = someButton.title,
            textAlign = TextAlign.Center,
            color = someButton.style?.foregroundColor?.toComposeColor() ?: Color.Black
        )
    }


}

@Preview
@Composable
fun sdButtonPreview() {
    SDButton(someButton = SDButton.mock)
}

object SDButton {

    val mock = SomeButton(
        id = null,
        actionId = null,
        title = "clieck meh mmooo",
        destination = null,
        style = SomeStyle(
            backgroundColor = SomeColor(
                1f,
                152f / 255f,
                0f,
                1f
            ),
            foregroundColor = SomeColor(
                81f / 255f,
                45f / 255f,
                168f / 255f,
                1f
            ),
            isHidden = false,
            cornerRadius = 4
        )
    )
}

