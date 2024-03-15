// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.3.0" apply false
    id("com.android.library") version "8.3.0" apply false
    id("org.jetbrains.kotlin.android") version "1.6.21" apply false
    id ("org.jetbrains.kotlin.kapt") version "1.6.0" apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
        remove(jcenter())
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.3.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        classpath("io.realm:realm-gradle-plugin:10.14.0-transformer-api")
    }
}
tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}