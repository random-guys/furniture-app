package com.example.furnitureapp.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.furnitureapp.data.local.AppRoomDatabase
import dagger.Module
import dagger.Provides

@Module(includes = [DbProviderModule::class])
class LocalModule {

    @AppScope
    @Provides
    fun provideDatabase(app: Application): AppRoomDatabase = AppRoomDatabase.buildDefault(app)

    @Provides
    fun provideSharedPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)
    }
}