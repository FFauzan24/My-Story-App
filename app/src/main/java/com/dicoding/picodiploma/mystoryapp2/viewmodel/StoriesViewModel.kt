package com.dicoding.picodiploma.mystoryapp2.viewmodel

import androidx.lifecycle.*
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.dicoding.picodiploma.mystoryapp2.model.repository.AllStoryRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.Story
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
@Suppress("DEPRECATION")
class StoriesViewModel @Inject constructor(private val repository: AllStoryRepository) : ViewModel(){

    fun showAllStories(): LiveData<PagingData<Story>> = repository.showAllStories().cachedIn(viewModelScope)

}


