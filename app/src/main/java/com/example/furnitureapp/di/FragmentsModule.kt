package com.example.furnitureapp.di

import com.example.furniture.profile.ui.ProfileFragment
import com.example.furnitureapp.home.HomeModule
import com.example.furnitureapp.home.ui.HomeFragment
import com.example.furnitureapp.home.ui.bathroom.BathRoomFragment
import com.example.furnitureapp.home.ui.livingroom.LivingRoomFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by kryptkode on 12/14/2019.
 */

@Module
abstract class FragmentsModule {

    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun provideHomeFragment(): HomeFragment

    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun provideLivingRoomFragment(): LivingRoomFragment

    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun provideBathRoomFragment(): BathRoomFragment

    @ContributesAndroidInjector()
    abstract fun provideProfileFragment(): ProfileFragment
}