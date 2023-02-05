package com.example.myapprecyclernavhiltmvvm.di

import com.example.myapprecyclernavhiltmvvm.data.FilmRepositoryImpl
import com.example.myapprecyclernavhiltmvvm.domain.FilmRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule() {

    @Binds
    abstract fun getFilms(impl: FilmRepositoryImpl): FilmRepository
}