package net.subroh0508.es2015.sample

import csstype.sx
import react.create
import react.dom.client.createRoot
import web.cssom.pct
import web.dom.document
import web.html.HTML.div

fun main() {
    val root = document.createElement(div)
        .apply { sx { height = 100.pct } }
        .also { document.body.appendChild(it) }

    createRoot(root)
        .render(App.create())
}
