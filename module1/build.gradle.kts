@Suppress("DSL_SCOPE_VIOLATION") // "libs" produces a false-positive warning, see https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    id(libs.plugins.kotlin.jvm.get().pluginId)
    alias(libs.plugins.buildconfig) apply false
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation(project(":module2"))
    testImplementation(libs.junit.api)    // junit-jupiter-api
    testRuntimeOnly(libs.junit.engine)    // junit-jupiter-engine لتشغيل JUnit 5
    testImplementation(libs.junit.params)

}
tasks.test {
    useJUnitPlatform()
}
