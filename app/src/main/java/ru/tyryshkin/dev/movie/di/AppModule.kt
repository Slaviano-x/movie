package ru.tyryshkin.dev.movie.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.tyryshkin.dev.featuremain.MainScreensImpl
import ru.tyryshkin.dev.navigation.screens.MainScreens
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface AppModule {

    @Singleton
    @Binds
    fun bindMainScreens(mainScreens: MainScreensImpl): MainScreens
}
