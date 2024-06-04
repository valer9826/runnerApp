plugins {
    `kotlin-dsl`
}
group = "com.example.runnerapp.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "runnerapp.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}