package com.example.furnitureapp.core.di

import com.example.furnitureapp.core.utils.AppCoroutineDispatchers
import dagger.Component
import javax.inject.Singleton

/**
 * Created by kryptkode on 12/14/2019.
 */
@Component(modules = [CoreModule::class])
@Singleton
interface CoreComponent {
    fun getDispatchers(): AppCoroutineDispatchers
}