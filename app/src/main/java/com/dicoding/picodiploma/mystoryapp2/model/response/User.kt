package com.dicoding.picodiploma.mystoryapp2.model.response

import com.google.gson.annotations.SerializedName

data class User (
    @field:SerializedName("name")
    var name: String? = null,

    @field:SerializedName("email")
    var email: String? = null,

    @field:SerializedName("password")
    var password: String? = null,
)