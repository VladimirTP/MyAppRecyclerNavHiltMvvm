package com.example.myapprecyclernavhiltmvvm.domain

interface FilmRepository {

    fun getFilms (): List<FilmUIData>
}