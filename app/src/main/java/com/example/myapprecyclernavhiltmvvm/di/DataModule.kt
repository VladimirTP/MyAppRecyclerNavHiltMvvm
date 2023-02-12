package com.example.myapprecyclernavhiltmvvm.di

import com.example.myapprecyclernavhiltmvvm.data.models.films.FilmRepositoryImpl
import com.example.myapprecyclernavhiltmvvm.data.models.user.UserRepositoryImpl
import com.example.myapprecyclernavhiltmvvm.domain.FilmRepository
import com.example.myapprecyclernavhiltmvvm.domain.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule() {

    @Binds
    abstract fun getFilms(impl: FilmRepositoryImpl): FilmRepository
    @Binds
    abstract fun getUserRepository(impl: UserRepositoryImpl): UserRepository
}