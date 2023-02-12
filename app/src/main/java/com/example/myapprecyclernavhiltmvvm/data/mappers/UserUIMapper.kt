package com.example.myapprecyclernavhiltmvvm.data.mappers

import com.example.myapprecyclernavhiltmvvm.data.models.user.UserResponse
import com.example.myapprecyclernavhiltmvvm.domain.UserData
import javax.inject.Inject

class UserUIMapper @Inject constructor() {

    operator fun invoke(response: UserResponse): UserData = with(response) {
        UserData(
            userId = userId ?: 0,
            favoriteFilmId = favoriteFilmId ?: 0
        )
    }
}