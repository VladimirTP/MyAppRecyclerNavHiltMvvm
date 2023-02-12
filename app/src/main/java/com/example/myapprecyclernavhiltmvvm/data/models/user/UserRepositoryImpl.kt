package com.example.myapprecyclernavhiltmvvm.data.models.user
import com.example.myapprecyclernavhiltmvvm.data.Server
import com.example.myapprecyclernavhiltmvvm.data.mappers.FilmUIMapper
import com.example.myapprecyclernavhiltmvvm.data.mappers.UserUIMapper
import com.example.myapprecyclernavhiltmvvm.domain.FilmUIData
import com.example.myapprecyclernavhiltmvvm.domain.UserData
import com.example.myapprecyclernavhiltmvvm.domain.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val server: Server,
    private val mapperUser: UserUIMapper,
    private val mapperFilm: FilmUIMapper
) : UserRepository {

    override suspend fun getUser(): UserData =
        withContext(Dispatchers.IO) { mapperUser(server.getUser()) }

    override suspend fun getFavoriteFilm(): FilmUIData =
        withContext(Dispatchers.IO) {
            mapperFilm(server.getFilmById(getUser().favoriteFilmId))
        }
}