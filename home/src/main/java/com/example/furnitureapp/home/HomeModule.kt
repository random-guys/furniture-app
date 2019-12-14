package com.example.furnitureapp.home

import com.example.furnitureapp.home.cache.HomeCacheModule
import com.example.furnitureapp.home.data.HomeDataModule
import com.example.furnitureapp.home.remote.HomeRemoteModule
import dagger.Module

/**
 * Created by kryptkode on 12/14/2019.
 */

@Module(
    includes = [
        HomeCacheModule::class,
        HomeDataModule::class,
        HomeRemoteModule::class

    ]
)
class HomeModule {

}