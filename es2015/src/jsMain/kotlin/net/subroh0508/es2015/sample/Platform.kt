package net.subroh0508.es2015.sample

fun res(path: String) = "composeResources/es2015_sample.es2015.generated.resources/$path"

class JsPlatform {
    val name: String = "Web with Kotlin/JS"
}

fun getPlatform() = JsPlatform()
