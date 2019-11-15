package com.example.furnitureapp.di

import com.example.furnitureapp.data.mock.MockHelper
import com.example.furnitureapp.data.mock.MockHelperInterface
import dagger.Binds
import dagger.Module

@Module
abstract class MockModule {

    @Binds
    abstract fun provideMockHelper(mockHelper: MockHelper): MockHelperInterface
}