package com.dicoding.picodiploma.mystoryapp2.model.repository

import android.content.Context
import android.preference.PreferenceManager
import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.dicoding.picodiploma.mystoryapp2.model.TOKEN
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiService
import com.dicoding.picodiploma.mystoryapp2.model.response.Story
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AllStoryRepository @Inject
constructor(private val apiService: ApiService, @ApplicationContext private val context: Context){

    private val token = "Bearer ${PreferenceManager.getDefaultSharedPreferences(context).getString(TOKEN, "")}"

    fun showAllStories() : LiveData<PagingData<Story>>{
        return Pager(
            config = PagingConfig(
                pageSize = 5
            ),
            pagingSourceFactory = {
                SourceStories(apiService, token)
        }
        ).liveData
    }
}