buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        // version catalog 적용
        classpath(libs.android.gradle)
        classpath(libs.kotlin.plugin)
    }
}

//// Top-level build file where you can add configuration options common to all sub-projects/modules. -- build.gradle
//plugins {
//    id 'com.android.application' version '7.3.1' apply false
//    id 'com.android.library' version '7.3.1' apply false
//    id 'org.jetbrains.kotlin.android' version '1.8.21' apply false
//}