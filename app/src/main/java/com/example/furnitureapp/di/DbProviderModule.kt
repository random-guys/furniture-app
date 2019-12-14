package com.example.furnitureapp.di

import com.example.furnitureapp.data.local.DbHomeProviderImpl
import com.example.furnitureapp.home.cache.DbHomeProvider
import dagger.Binds
import dagger.Module

/**
 * Created by kryptkode on 12/14/2019.
 */
@Module
abstract class DbProviderModule {

    @Binds
    abstract fun provideHomeDb(dbProviderImpl: DbHomeProviderImpl): DbHomeProvider
}