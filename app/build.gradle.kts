plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.multimodule"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        namespace = "com.example.multimodule"
        testNamespace = "com.example.multimodule.test"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        // We likely don't reeeeally need this, but hey — shiny
//        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

//    implementation 'androidx.core:core-ktx:1.10.1'
//    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.6.1'
//
//    testImplementation 'junit:junit:4.13.2'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
//    androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_ui_version"
//    debugImplementation "androidx.compose.ui:ui-tooling:$compose_ui_version"
//    debugImplementation "androidx.compose.ui:ui-test-manifest:$compose_ui_version"

//    // 하나씩 추가
//    implementation(libs.androidx.compose.core)

    // 번들로 일괄 추가
    implementation(libs.bundles.compose)

    // 하나씩 추가
    implementation(libs.androidx.core.ktx)

    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.junit.junit)

    // 모듈
    implementation(project(":chart"))
}