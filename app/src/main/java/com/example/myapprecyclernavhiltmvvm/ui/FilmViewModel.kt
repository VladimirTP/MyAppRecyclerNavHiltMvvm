package com.example.myapprecyclernavhiltmvvm.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapprecyclernavhiltmvvm.domain.FilmRepository
import com.example.myapprecyclernavhiltmvvm.domain.FilmUIData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class FilmViewModel @Inject constructor(private val repository: FilmRepository) : ViewModel() {

    private val _liveData = MutableLiveData<List<FilmUIData>>()
    val liveData: LiveData<List<FilmUIData>> get() = _liveData

    fun getFilms() {
        val filmInfo = repository.getFilms()
        _liveData.value = filmInfo
    }
}