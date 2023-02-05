package com.example.myapprecyclernavhiltmvvm.data.mappers

import com.example.myapprecyclernavhiltmvvm.data.models.FilmResponse
import com.example.myapprecyclernavhiltmvvm.domain.FilmUIData
import javax.inject.Inject

class FilmUIMapper @Inject constructor() {

    operator fun invoke(response: FilmResponse) = with(response) {
        FilmUIData(
            imageUrl = imageUrl.orEmpty(),
            name = name.orEmpty(),
            trueOscar = trueOscar?: false,
            rating = rating?: 0.0,
            description = description.orEmpty()
        )
    }
}