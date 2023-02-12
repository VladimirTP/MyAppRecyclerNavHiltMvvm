package com.example.myapprecyclernavhiltmvvm.data.models.films

data class FilmResponse(
    val id: Int? = null,
    val imageUrl: String? = null,
    val name: String? = null,
    val trueOscar: Boolean? = false,
    val rating: Double? = 0.0,
    val description: String? = null
)
