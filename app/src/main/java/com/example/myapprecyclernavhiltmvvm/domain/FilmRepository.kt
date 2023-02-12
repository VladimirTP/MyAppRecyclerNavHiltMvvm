package com.example.myapprecyclernavhiltmvvm.domain

interface FilmRepository {
    suspend fun getFilms (): List<FilmUIData>
}