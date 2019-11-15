package com.example.furnitureapp.di

import android.app.Application
import com.example.furnitureapp.ui.home.living_room.LivingRoomFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [FurnitureDatabaseModule::class, MockModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
    fun inject(livingRoomFragment: LivingRoomFragment)
}