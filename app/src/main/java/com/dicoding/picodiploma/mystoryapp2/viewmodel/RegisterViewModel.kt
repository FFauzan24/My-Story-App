package com.dicoding.picodiploma.mystoryapp2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.mystoryapp2.model.repository.RegisterRepository
import com.dicoding.picodiploma.mystoryapp2.model.response.RegisterResponse
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class RegisterViewModel @Inject constructor(private val registerRepository: RegisterRepository) : ViewModel(){

    fun userRegister(name: String, email: String, password: String): LiveData<ResultData<RegisterResponse>> =
        registerRepository.userRegister(name, email, password)
}