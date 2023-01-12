package com.dicoding.picodiploma.mystoryapp2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.mystoryapp2.model.repository.DetailStoriesRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.DetailResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val repository: DetailStoriesRepository) : ViewModel(){

    fun getDetailStories(id: String) : LiveData<ResultData<DetailResponse>> = repository.getDetailStories(id)

}