package com.example.furnitureapp.di

import com.example.furnitureapp.MyApplication
import com.example.furnitureapp.core.di.CoreComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@AppScope
@Component(
    modules = [
        AppModule::class,
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class],
    dependencies = [CoreComponent::class]
)
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: MyApplication): Builder

        fun coreComponent(coreComponent: CoreComponent): Builder
        fun build(): AppComponent
    }
}