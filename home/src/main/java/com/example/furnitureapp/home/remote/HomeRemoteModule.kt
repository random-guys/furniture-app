package com.example.furnitureapp.home.remote

import com.example.furnitureapp.home.data.repository.HomeRemote
import com.example.furnitureapp.home.remote.service.HomeApi
import com.example.furnitureapp.home.remote.service.MockHomeApi
import dagger.Binds
import dagger.Module

/**
 * Created by kryptkode on 12/14/2019.
 */

@Module
abstract class HomeRemoteModule {

    @Binds
    abstract fun provideRemote(homeRemoteImpl: HomeRemoteImpl): HomeRemote

    @Binds
    abstract fun provideApi(mockHomeApi: MockHomeApi): HomeApi
}