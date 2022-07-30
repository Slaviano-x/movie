package ru.tyryshkin.dev.featuremain.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.tyryshkin.dev.featuremain.data.MovieRepositoryImpl
import ru.tyryshkin.dev.featuremain.domain.repository.MovieRepository

@Module
@InstallIn(ViewModelComponent::class)
interface MainModule {

    @Binds
    fun bindRepository(repository: MovieRepositoryImpl): MovieRepository
}
