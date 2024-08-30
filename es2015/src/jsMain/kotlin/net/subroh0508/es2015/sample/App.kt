package net.subroh0508.es2015.sample

import mui.material.Button
import net.subroh0508.es2015.sample.theme.ThemeModule
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import react.useState

val App = FC<Props> {
    ThemeModule {
        val (showContent, setShowContent) = useState(false)

        Button {
            onClick = { setShowContent(!showContent) }

            +"Click me!"
        }

        if (showContent) {
            GreetingFunction {}
        }
    }
}

private val GreetingFunction = FC<Props> {
    val (greeting) = useState(Greeting().greet())

    div {
        img {
            src = res("drawable/mitsumine.webp")
        }
        +"Compose: $greeting"
    }
}
