package com.example.furnitureapp.home.cache

import com.example.furnitureapp.home.data.repository.HomeCache
import dagger.Binds
import dagger.Module

/**
 * Created by kryptkode on 12/14/2019.
 */

@Module
abstract class HomeCacheModule {

    @Binds
    abstract fun provideHomeCache(homeCacheImpl: HomeCacheImpl): HomeCache
}