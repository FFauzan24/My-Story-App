package com.dicoding.picodiploma.mystoryapp2.data

import com.dicoding.picodiploma.mystoryapp2.model.response.RegisterResponse

fun SuccessRegisterTest(): RegisterResponse {
    return RegisterResponse(
        error = false,
        message = "User Created"
    )
}
fun FailedRegisterTest(): RegisterResponse{
    return RegisterResponse(
        error = true,
        message = "Email is already taken"

    )
}