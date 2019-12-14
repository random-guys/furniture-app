package com.example.furnitureapp.di.viewmodel

import androidx.lifecycle.ViewModel
import com.example.furniture.profile.presentation.ProfileViewModel
import com.example.furnitureapp.home.presentation.HomeViewModel
import com.example.furnitureapp.home.presentation.bathroom.BathRoomViewModel
import com.example.furnitureapp.home.presentation.livingroom.LivingRoomViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(LivingRoomViewModel::class)
    abstract fun bindLivingRoomViewModel(viewModel: LivingRoomViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(BathRoomViewModel::class)
    abstract fun bindBathRoomViewModel(viewModel: BathRoomViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun bindProfileViewModel(viewModel: ProfileViewModel): ViewModel

}