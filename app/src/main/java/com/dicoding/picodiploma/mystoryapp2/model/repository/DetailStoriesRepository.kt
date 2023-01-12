package com.dicoding.picodiploma.mystoryapp2.model.repository

import android.content.Context
import android.preference.PreferenceManager
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.mystoryapp2.model.TOKEN
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiService
import com.dicoding.picodiploma.mystoryapp2.model.response.DetailResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.ui.util.convertErrorData
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class DetailStoriesRepository @Inject constructor(private val apiService: ApiService, @ApplicationContext private val context: Context){

    @Suppress("DEPRECATION")
    private val token = "Bearer ${PreferenceManager.getDefaultSharedPreferences(context).getString(TOKEN, "")}"

    fun getDetailStories(id: String) : LiveData<ResultData<DetailResponse>>{
        val detailData: MutableLiveData<ResultData<DetailResponse>> = MutableLiveData()

        apiService.GetDetailStories(token, id).enqueue(object : Callback<DetailResponse>{
            override fun onResponse(
                call: Call<DetailResponse>,
                response: Response<DetailResponse>
            ) {
                if (response.isSuccessful){
                    detailData.postValue(ResultData.Success(response.body() as DetailResponse))
                }
                else{
                    val errorData = response.errorBody()?.string()?.let { convertErrorData(it) }
                    detailData.postValue(ResultData.Error(errorData?.message ?: "Failure get Data", response.code(), null))
                }
            }

            override fun onFailure(call: Call<DetailResponse>, t: Throwable) {
                detailData.postValue(ResultData.Error("Failure Convert Data", null, null))
            }
        })
        return detailData
    }

}