package com.dicoding.picodiploma.mystoryapp2.model.repository

import android.content.Context
import android.preference.PreferenceManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.mystoryapp2.model.TOKEN
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiService
import com.dicoding.picodiploma.mystoryapp2.model.response.StoriesResponse
import com.dicoding.picodiploma.mystoryapp2.ui.AllStoriesActivity
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.ui.util.convertErrorData
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


class MapsRepository @Inject constructor(private val apiService: ApiService, @ApplicationContext private val context: Context) {

    private val token = "Bearer ${
        PreferenceManager.getDefaultSharedPreferences(context).getString(
            TOKEN, "")}"

    fun getStoriesLocation() : LiveData<ResultData<StoriesResponse>>{
        val locationData : MutableLiveData<ResultData<StoriesResponse>> = MutableLiveData()
        locationData.postValue(ResultData.Loading())

        apiService.getLocationStories(token, 1).enqueue(object : Callback<StoriesResponse>{
            override fun onResponse(
                call: Call<StoriesResponse>,
                response: Response<StoriesResponse>
            ) {
                if (response.isSuccessful){
                    locationData.postValue(ResultData.Success(response.body() as StoriesResponse))
                }
                else{
                    val errorData = response.errorBody()?.string()?.let { convertErrorData(it) }
                    locationData.postValue(ResultData.Error(errorData?.message ?: "Failure Get Data", response.code(), null))
                }
            }

            override fun onFailure(call: Call<StoriesResponse>, t: Throwable) {
                locationData.postValue(ResultData.Error(t.message.toString(), null, null))
            }
        })
        return locationData
    }
}