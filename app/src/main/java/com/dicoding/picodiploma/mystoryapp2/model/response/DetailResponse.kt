package com.dicoding.picodiploma.mystoryapp2.model.response

import com.google.gson.annotations.SerializedName

data class DetailResponse(

	@field:SerializedName("error")
	val error: Boolean? = null,

	@field:SerializedName("message")
	val message: String,

	@field:SerializedName("story")
	val story: Story? = null
)

