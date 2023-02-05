package com.example.myapprecyclernavhiltmvvm.data

import com.example.myapprecyclernavhiltmvvm.data.mappers.FilmUIMapper
import com.example.myapprecyclernavhiltmvvm.domain.FilmRepository
import com.example.myapprecyclernavhiltmvvm.domain.FilmUIData
import javax.inject.Inject

class FilmRepositoryImpl @Inject constructor(
    private val server: Server,
    private val mapper: FilmUIMapper
) : FilmRepository {

    override fun getFilms(): List<FilmUIData> = server.getFilms().map { mapper(it) }
}