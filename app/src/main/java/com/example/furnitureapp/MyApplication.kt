package com.example.furnitureapp

import android.app.Application
import com.example.furnitureapp.di.AppComponent
import com.example.furnitureapp.di.DaggerAppComponent

class MyApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}