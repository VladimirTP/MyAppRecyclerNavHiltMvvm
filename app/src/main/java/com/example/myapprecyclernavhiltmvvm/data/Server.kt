package com.example.myapprecyclernavhiltmvvm.data

import com.example.myapprecyclernavhiltmvvm.data.models.FilmResponse
import javax.inject.Inject

class Server @Inject constructor() {

    fun getFilms(): List<FilmResponse> = listOf(
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1898899/443e111e-f714-4954-83d0-3e0acca2a561/1920x",
            "The Green Mile",
            true,
            9.1,
            "Отличный фильм"
        ),
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/3055c719-ca7f-4bd1-8bb4-c1c4ceccc0cc/1920x",
            "Snowden",
            false,
            7.0,
            "Плохой фильм"
        ),
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/6201401/74d79fc9-d6c9-45b8-9f50-9131c3fc3ccc/1920x",
            "Forrest Gump",
            true,
            8.9,
            "Хороший фильм"
        ),
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/78c36c0f-aefd-4102-bc3b-bac0dd4314d8/1920x",
            "Interstellar",
            true,
            8.6,
            "Хороший фильм"
        ),
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1773646/0a94003c-10e8-4387-b99b-1fb7ccdcd1d9/1920x",
            "The Maze Runner",
            false,
            6.8,
            "Плохой фильм"
        ),
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/4774061/7cab584d-092e-4c22-91c5-8b2dac51addf/1920x",
            "Dune: Part One",
            false,
            7.7,
            "Хороший фильм"
        ),
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1946459/25dcb99b-15b9-4af8-ac2b-deccfce2b369/1920x",
            "Mad Max: Fury Road",
            false,
            7.8,
            "Хороший фильм"
        ),
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/6b155899-a761-43e8-8285-c80d5ad8697f/1920x",
            "The Professor and the Madman",
            false,
            7.3,
            "Хороший фильм"
        ),
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/5cda3fb9-8e03-450f-bbe1-d35ba0b4d5ff/1920x",
            "Sen to Chihiro no kamikakushi",
            true,
            8.5,
            "Хороший фильм"
        ),
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/4774061/32199a9a-7ab1-47c6-bf52-e05c4600b91b/1920x",
            "Cloud Atlas",
            false,
            7.7,
            "Хороший фильм"
        ),
        FilmResponse(
            "https://avatars.mds.yandex.net/get-kinopoisk-image/1773646/e26044e5-2d5a-4b38-a133-a776ad93366f/1920x",
            "The Shawshank Redemption",
            true,
            9.1,
            "Отличный фильм"
        )
    )
}