package com.example.furnitureapp.di

import com.example.furnitureapp.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by kryptkode on 12/14/2019.
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun provideMainActivity(): MainActivity
}