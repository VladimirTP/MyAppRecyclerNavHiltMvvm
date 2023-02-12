package com.example.myapprecyclernavhiltmvvm.domain

interface UserRepository {
    suspend fun getUser(): UserData

    suspend fun getFavoriteFilm(): FilmUIData
}