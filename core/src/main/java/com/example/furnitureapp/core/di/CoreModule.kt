package com.example.furnitureapp.core.di

import com.example.furnitureapp.core.utils.AppCoroutineDispatchers
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

/**
 * Created by kryptkode on 12/14/2019.
 */
@Module
class CoreModule {
    @Singleton
    @Provides
    fun provideDispatchers(): AppCoroutineDispatchers {
        return AppCoroutineDispatchers(
            Dispatchers.IO,
            Dispatchers.Default,
            Dispatchers.Main
        )
    }
}