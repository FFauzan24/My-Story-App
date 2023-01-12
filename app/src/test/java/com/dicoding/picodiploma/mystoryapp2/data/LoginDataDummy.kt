package com.dicoding.picodiploma.mystoryapp2.data

import com.dicoding.picodiploma.mystoryapp2.model.response.LoginResult
import com.dicoding.picodiploma.mystoryapp2.model.response.LoginStoriesResponse


fun SuccessLoginTest(): LoginStoriesResponse{
    val loginResult = LoginResult(
        userId = "user-y4gWQzEtveVTg6Up",
        name = "farhan",
        token = "token"
    )
    return LoginStoriesResponse(
        error = false,
        message = "success",
        loginResult = loginResult
    )
}

fun FailedLoginTest(): LoginStoriesResponse{
    return LoginStoriesResponse(
        error = true,
        message = "Invalid password"
    )
}