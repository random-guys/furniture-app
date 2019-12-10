/**
 * Created by kryptkode on 12/10/2019.
 */

import org.gradle.api.JavaVersion

object Config {
    val minSdk = 16
    val compileSdk = 29
    val targetSdk = 29
    val javaVersion = JavaVersion.VERSION_1_8
}

object Versions {
    val kotlin = "1.3.61"
    val coreKtx = "1.1.0"
    val roomVersion = "2.2.2"
    val coroutinesVersion = "1.3.2"
    val liveDataKtx = "2.2.0-rc01"
    val lifecycleVersion = "2.1.0"
    val glideVersion = "4.9.0"
    val daggerVersion = "2.24"
    val appCompat = "1.1.0"
    val material = "1.0.0"
    val legacySupport = "1.0.0"
    val smartTabLayout = "1.6.1@aar"
    val contraintLayout = "1.1.3"
    val fragNav = "3.2.0"
    val bottomNavigationViewEx = "2.0.4"
    val shapeImageView = "0.9.3@aar"
    val junit = "4.12"
    val testExtJunit = "1.1.1"
    val espressoCore = "3.2.0"
}

object MainDeps {
    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val material = "com.google.android.material:material:${Versions.material}"


    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.contraintLayout}"
    val legacySupport = "androidx.legacy:legacy-support-v4:${Versions.legacySupport}"
    val shapeImageView = "com.github.siyamed:android-shape-imageview:${Versions.shapeImageView}"
    val smartTabLayout = "com.ogaclejapan.smarttablayout:library:${Versions.smartTabLayout}"
    val smartTabLayoutUtils = "com.ogaclejapan.smarttablayout:utils-v13:${Versions.smartTabLayout}"
    val bottomNavigationViewEx =
        "com.github.ittianyu:BottomNavigationViewEx:${Versions.bottomNavigationViewEx}"
    val fragNav = "com.ncapdevi:frag-nav:${Versions.fragNav}"

    // Room
    val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    val roomKtx = "androidx.room:room-ktx:${Versions.roomVersion}"

    // Lifecycle (ViewModel + LiveData)
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleVersion}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycleVersion}"
    val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveDataKtx}"


    // Kotlin Coroutines
    val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"


    // Glide
    val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"

    // Dagger core
    val dagger = "com.google.dagger:dagger:${Versions.daggerVersion}"
    val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.daggerVersion}"

    //Dagger Android
    val daggerAndroid = "com.google.dagger:dagger-android:${Versions.daggerVersion}"
    val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${Versions.daggerVersion}"
    val daggerAndroidProcessor =
        "com.google.dagger:dagger-android-processor:${Versions.daggerVersion}"


}

object TestDeps {
    val junit = "junit:junit:${Versions.junit}"
    val testExtJunit = "androidx.test.ext:junit:${Versions.testExtJunit}"

    val coreTesting = "androidx.arch.core:core-testing:${Versions.lifecycleVersion}"
    val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesVersion}"

}

object AndroidTestDeps{
    val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    val roomTesting = "androidx.room:room-testing:${Versions.roomVersion}"
}

