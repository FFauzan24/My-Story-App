package com.dicoding.picodiploma.mystoryapp2.model.response

import com.google.gson.annotations.SerializedName

data class LoginStoriesResponse(

	@field:SerializedName("loginResult")
	val loginResult: LoginResult? = null,

	@field:SerializedName("error")
	val error: Boolean,

	@field:SerializedName("message")
	val message: String
)

data class LoginResult(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("userId")
	val userId: String,

	@field:SerializedName("token")
	val token: String
)

