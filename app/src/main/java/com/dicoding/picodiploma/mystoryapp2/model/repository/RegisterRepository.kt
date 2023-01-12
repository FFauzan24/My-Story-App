package com.dicoding.picodiploma.mystoryapp2.model.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiService
import com.dicoding.picodiploma.mystoryapp2.model.response.RegisterResponse
import com.dicoding.picodiploma.mystoryapp2.model.response.User
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.ui.util.convertErrorData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class RegisterRepository @Inject constructor(private val apiService: ApiService){


    fun userRegister(name: String, email: String, password: String) : LiveData<ResultData<RegisterResponse>>{

        val registData: MutableLiveData<ResultData<RegisterResponse>> = MutableLiveData()
        registData.postValue(ResultData.Loading())
        val userRegistData = User(name = name, email = email, password = password)

        apiService.UserRegister(userRegistData).enqueue(object : Callback<RegisterResponse>{
            override fun onResponse(
                call: Call<RegisterResponse>,
                response: Response<RegisterResponse>
            ) {
                if (response.isSuccessful){
                    registData.postValue(ResultData.Success(response.body() as RegisterResponse))
                }
                else{
                    val errorData = response.errorBody()?.let { convertErrorData(it.toString()) }
                    registData.postValue(ResultData.Error(errorData?.message, response.code(), null))
                }
            }

            override fun onFailure(call: Call<RegisterResponse>, t: Throwable) {
                registData.postValue(ResultData.Error(t.message.toString(), null, null))
            }
        })
        return registData
    }
}