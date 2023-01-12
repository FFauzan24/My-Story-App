package com.dicoding.picodiploma.mystoryapp2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.mystoryapp2.model.response.LoginStoriesResponse
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiConfig
import com.dicoding.picodiploma.mystoryapp2.model.repository.LoginRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.User
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import dagger.hilt.android.lifecycle.HiltViewModel

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val loginRepository: LoginRepository) : ViewModel(){

    fun userLogin(email: String, password: String): LiveData<ResultData<LoginStoriesResponse>> =
        loginRepository.userLogin(email, password)
}