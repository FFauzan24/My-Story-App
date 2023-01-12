package com.dicoding.picodiploma.mystoryapp2.model.network

import com.dicoding.picodiploma.mystoryapp2.model.response.StoriesResponse
import com.dicoding.picodiploma.mystoryapp2.model.response.LoginStoriesResponse
import com.dicoding.picodiploma.mystoryapp2.model.response.DetailResponse
import com.dicoding.picodiploma.mystoryapp2.model.response.RegisterResponse
import com.dicoding.picodiploma.mystoryapp2.model.response.UploadStoriesResponse
import com.dicoding.picodiploma.mystoryapp2.model.response.User
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @POST("register")
    fun UserRegister(
        @Body user: User
    ): Call<RegisterResponse>

    @Headers("Content-Type: application/json", "X-Requested-With: XMLHttpRequest")
    @POST("login")
    fun UserLogin(
        @Body user: User
    ): Call<LoginStoriesResponse>

    @GET("stories")
    suspend fun GetAllStories(
        @Header("Authorization") token: String,
        @Query("page") page: Int,
        @Query("size") size: Int
    ): StoriesResponse

    @GET("stories/{id}")
    fun GetDetailStories(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): Call<DetailResponse>

    @Multipart
    @POST("stories")
    fun UploadStories(
        @Header("Authorization") token: String,
        @Part("description") description: RequestBody,
        @Part file: MultipartBody.Part
    ): Call<UploadStoriesResponse>

    @GET("stories")
    fun getLocationStories(
        @Header("Authorization") token: String,
        @Query("location") location : Int
    ): Call<StoriesResponse>
}