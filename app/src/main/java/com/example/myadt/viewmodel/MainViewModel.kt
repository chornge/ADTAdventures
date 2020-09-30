package com.example.myadt.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.myadt.repository.MainRepository
import com.example.myadt.utils.ADTResource
import kotlinx.coroutines.Dispatchers


/*
 * Created by chornge on 09/30/2020.
 */

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getCharacters() = liveData(Dispatchers.IO) {
        emit(ADTResource.loading(data = null))
        try {
            emit(ADTResource.success(data = mainRepository.getCharacters().results))
        } catch (exception: Exception) { // Maybe change to a more specific exception?
            emit(ADTResource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}