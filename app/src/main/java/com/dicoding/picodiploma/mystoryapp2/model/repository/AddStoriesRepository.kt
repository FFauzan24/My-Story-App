package com.dicoding.picodiploma.mystoryapp2.model.repository

import android.content.Context
import android.preference.PreferenceManager
import android.util.TimeFormatException
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.mystoryapp2.model.TOKEN
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiService
import com.dicoding.picodiploma.mystoryapp2.model.response.DetailResponse
import com.dicoding.picodiploma.mystoryapp2.model.response.UploadStoriesResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.ui.util.convertErrorData
import com.dicoding.picodiploma.mystoryapp2.ui.util.createPartFromString
import com.dicoding.picodiploma.mystoryapp2.ui.util.prepareFilePart
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import javax.inject.Inject

class AddStoriesRepository @Inject constructor(private val apiService: ApiService, @ApplicationContext private val context: Context){

    private val token = "Bearer ${
        PreferenceManager.getDefaultSharedPreferences(context).getString(
            TOKEN, "")}"

    fun addStory(desc: String, file: File) : LiveData<ResultData<UploadStoriesResponse>>{
        val addData: MutableLiveData<ResultData<UploadStoriesResponse>> = MutableLiveData()

        val description = createPartFromString(desc)
        val storiesFile = prepareFilePart("photo", file)
        apiService.UploadStories(token, description, storiesFile).enqueue(object : Callback<UploadStoriesResponse>{
            override fun onResponse(
                call: Call<UploadStoriesResponse>,
                response: Response<UploadStoriesResponse>
            ) {
                if (response.isSuccessful){
                   addData.postValue(ResultData.Success(response.body() as UploadStoriesResponse))
                }
                else{
                    val errorData = response.errorBody()?.string()?.let { convertErrorData(it) }
                    addData.postValue(ResultData.Error(errorData?.message ?: "Failure Get Data", response.code(), null))
                }
            }

            override fun onFailure(call: Call<UploadStoriesResponse>, t: Throwable) {
                addData.postValue(ResultData.Error(t.message.toString(), null, null))
            }
        })
        return addData
    }

}