package com.example.furnitureapp.di

import android.app.Application
import android.content.Context
import com.example.furnitureapp.MyApplication
import com.example.furnitureapp.di.viewmodel.ViewModelFactoryModule
import com.example.furnitureapp.di.viewmodel.ViewModelModule
import com.example.furnitureapp.home.HomeModule
import dagger.Binds
import dagger.Module

/**
 * Created by kryptkode on 12/14/2019.
 */

@Module(
    includes = [
        LocalModule::class,
        FragmentsModule::class,
        ActivityModule::class,
        ViewModelFactoryModule::class,
        ViewModelModule::class,
        HomeModule::class
    ]
)
abstract class AppModule {
    @Binds
    @AppScope
    abstract fun provideApplicationContext(application: MyApplication): Context


    @Binds
    @AppScope
    abstract fun provideApplication(application: MyApplication): Application
}