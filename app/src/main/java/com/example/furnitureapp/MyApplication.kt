package com.example.furnitureapp

import com.example.furnitureapp.core.di.CoreComponent
import com.example.furnitureapp.core.di.CoreComponentProvider
import com.example.furnitureapp.core.di.DaggerCoreComponent
import com.example.furnitureapp.di.AppComponent
import com.example.furnitureapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber

class MyApplication : DaggerApplication(), CoreComponentProvider {

    private lateinit var coreComponent: CoreComponent

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .coreComponent(provideCoreComponent())
            .application(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        initLogger()
    }

    private fun initLogger() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return appComponent
    }


    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                .builder()
                .build()
        }
        return coreComponent
    }


}