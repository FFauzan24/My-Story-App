package com.dicoding.picodiploma.mystoryapp2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.mystoryapp2.model.repository.MapsRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.StoriesResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MapsViewModel @Inject constructor(private val repository: MapsRepository) : ViewModel(){

    fun getStoriesLocation() : LiveData<ResultData<StoriesResponse>> = repository.getStoriesLocation()

}