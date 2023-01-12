package com.dicoding.picodiploma.mystoryapp2.model.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiConfig
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiService
import com.dicoding.picodiploma.mystoryapp2.model.response.LoginStoriesResponse
import com.dicoding.picodiploma.mystoryapp2.model.response.User
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.ui.util.convertErrorData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class LoginRepository @Inject constructor(private val apiService: ApiService){

    fun userLogin(email: String, password: String) : LiveData<ResultData<LoginStoriesResponse>>{
        val loginData: MutableLiveData<ResultData<LoginStoriesResponse>> = MutableLiveData()
        loginData.postValue(ResultData.Loading())

        val userLoginData = User(email = email, password = password)

        apiService.UserLogin(userLoginData).enqueue(object : Callback<LoginStoriesResponse>{
            override fun onResponse(
                call: Call<LoginStoriesResponse>,
                response: Response<LoginStoriesResponse>
            ) {
                if (response.isSuccessful){
                    loginData.postValue(ResultData.Success(response.body() as LoginStoriesResponse))
                }
                else{
                    val errorData = response.errorBody()?.string()?.let { convertErrorData(it) }
                    loginData.postValue(ResultData.Error(errorData?.message, response.code(), null))
                }
            }

            override fun onFailure(call: Call<LoginStoriesResponse>, t: Throwable) {
                loginData.postValue(ResultData.Error(t.message.toString(), null, null))
            }

        })
        return loginData
    }

}
