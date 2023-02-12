package com.example.myapprecyclernavhiltmvvm.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapprecyclernavhiltmvvm.R
import com.example.myapprecyclernavhiltmvvm.domain.FilmRepository
import com.example.myapprecyclernavhiltmvvm.domain.FilmUIData
import com.example.myapprecyclernavhiltmvvm.domain.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import java.net.SocketTimeoutException
import javax.inject.Inject

@HiltViewModel
class FilmViewModel @Inject constructor(
    private val repository: FilmRepository,
    private val userRepository: UserRepository,
) : ViewModel() {

    private val _liveData = MutableLiveData<List<FilmUIData>>()
    val liveData: LiveData<List<FilmUIData>> get() = _liveData

    private val _errorLiveData = MutableLiveData<Int>()
    val errorLiveData: LiveData<Int> get() = _errorLiveData

    private val _userFavoriteFilmLiveData = MutableLiveData<FilmUIData?>()
    val userFavoriteFilmLiveData: LiveData<FilmUIData?> get() = _userFavoriteFilmLiveData

    private val exceptionHandler = CoroutineExceptionHandler{_, throwable ->
        when (throwable) {
            is SocketTimeoutException -> _errorLiveData.value = R.string.connection_error
            else -> _errorLiveData.value = R.string.unknown_error
        }
    }

    private val _loadingLiveData = MutableLiveData<Boolean>()
    val loadingLiveData: LiveData<Boolean> get() = _loadingLiveData

    fun getFilms() {
        viewModelScope.launch (exceptionHandler) {
            val filmInfo = repository.getFilms()
            _liveData.value = filmInfo
        }
    }

    fun getUserFavoriteFilm() {
        viewModelScope.launch {
            val favoriteFilm = userRepository.getFavoriteFilm()
            _userFavoriteFilmLiveData.value = favoriteFilm
        }
    }
}