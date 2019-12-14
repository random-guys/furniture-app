package com.example.furnitureapp.home.data

import com.example.furnitureapp.home.cache.prefs.ConfigPrefImpl
import com.example.furnitureapp.home.cache.prefs.ConfigPrefs
import com.example.furnitureapp.home.data.repository.HomeRepositoryImpl
import com.example.furnitureapp.home.domain.repository.HomeRepository
import dagger.Binds
import dagger.Module

/**
 * Created by kryptkode on 12/14/2019.
 */

@Module
abstract class HomeDataModule {

    @Binds
    abstract fun provideHomeRepository(homeRepositoryImpl: HomeRepositoryImpl): HomeRepository

    @Binds
    abstract fun provideConfigPrefs(configPrefImpl: ConfigPrefImpl): ConfigPrefs
}