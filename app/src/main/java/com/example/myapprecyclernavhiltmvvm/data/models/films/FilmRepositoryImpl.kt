package com.example.myapprecyclernavhiltmvvm.data.models.films

import com.example.myapprecyclernavhiltmvvm.data.Server
import com.example.myapprecyclernavhiltmvvm.data.mappers.FilmUIMapper
import com.example.myapprecyclernavhiltmvvm.domain.FilmRepository
import com.example.myapprecyclernavhiltmvvm.domain.FilmUIData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class FilmRepositoryImpl @Inject constructor(
    private val server: Server,
    private val mapper: FilmUIMapper
) : FilmRepository {

    override suspend fun getFilms(): List<FilmUIData> = withContext(Dispatchers.IO) {server.getFilms().map { mapper(it) }}
}