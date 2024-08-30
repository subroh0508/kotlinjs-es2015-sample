import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.compose.compiler)
}

kotlin {
    js {
        browser {
            commonWebpackConfig {
                outputFileName = "index.js"
            }
        }
        binaries.executable()
    }
    
    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtime.compose)
        }

        jsMain.dependencies {
            implementation(dependencies.platform(libs.kotlin.wrappers.bom))
            implementation(libs.kotlin.js)
            implementation(libs.kotlin.react)
            implementation(libs.kotlin.emotion)
            implementation(libs.kotlin.mui.material)
        }
    }
}

tasks.withType<KotlinJsCompile>().configureEach {
    compilerOptions {
        target.set("es2015")
    }
}
