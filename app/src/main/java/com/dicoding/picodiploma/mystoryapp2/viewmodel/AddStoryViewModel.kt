

package com.dicoding.picodiploma.mystoryapp2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.mystoryapp2.model.repository.AddStoriesRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.UploadStoriesResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import dagger.hilt.android.lifecycle.HiltViewModel
import java.io.File
import javax.inject.Inject

@HiltViewModel
@Suppress("DEPRECATION")
class AddStoryViewModel @Inject constructor(private val repository: AddStoriesRepository) : ViewModel(){

    fun addStory(desc: String, file: File): LiveData<ResultData<UploadStoriesResponse>> = repository.addStory(desc, file)

}