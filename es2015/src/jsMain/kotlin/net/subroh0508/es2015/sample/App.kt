package net.subroh0508.es2015.sample

import androidx.compose.runtime.*

import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun App() {
    var showContent by remember { mutableStateOf(false) }
    Div {
        Button(
            attrs = {
                onClick { showContent = !showContent }
            }
        ) {
            Text("Click me!")
        }

        if (showContent) {
            val greeting = remember { Greeting().greet() }
            Div {
                //Img(src = Res.drawable.compose_multiplatform.toString())
                Text("Compose: $greeting")
            }
        }
    }
}
