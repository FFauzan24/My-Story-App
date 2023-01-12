package com.dicoding.picodiploma.mystoryapp2.model.network;

import com.dicoding.picodiploma.mystoryapp2.model.response.StoriesResponse;
import com.dicoding.picodiploma.mystoryapp2.model.response.LoginStoriesResponse;
import com.dicoding.picodiploma.mystoryapp2.model.response.DetailResponse;
import com.dicoding.picodiploma.mystoryapp2.model.response.RegisterResponse;
import com.dicoding.picodiploma.mystoryapp2.model.response.UploadStoriesResponse;
import com.dicoding.picodiploma.mystoryapp2.model.response.User;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0005H\'J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\'J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\'J\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0007H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/model/network/ApiService;", "", "GetAllStories", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/StoriesResponse;", "token", "", "page", "", "size", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GetDetailStories", "Lretrofit2/Call;", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/DetailResponse;", "id", "UploadStories", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/UploadStoriesResponse;", "description", "Lokhttp3/RequestBody;", "file", "Lokhttp3/MultipartBody$Part;", "UserLogin", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/LoginStoriesResponse;", "user", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/User;", "UserRegister", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/RegisterResponse;", "getLocationStories", "location", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "register")
    public abstract retrofit2.Call<com.dicoding.picodiploma.mystoryapp2.model.response.RegisterResponse> UserRegister(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.dicoding.picodiploma.mystoryapp2.model.response.User user);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "login")
    @retrofit2.http.Headers(value = {"Content-Type: application/json", "X-Requested-With: XMLHttpRequest"})
    public abstract retrofit2.Call<com.dicoding.picodiploma.mystoryapp2.model.response.LoginStoriesResponse> UserLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.dicoding.picodiploma.mystoryapp2.model.response.User user);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "stories")
    public abstract java.lang.Object GetAllStories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "size")
    int size, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dicoding.picodiploma.mystoryapp2.model.response.StoriesResponse> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "stories/{id}")
    public abstract retrofit2.Call<com.dicoding.picodiploma.mystoryapp2.model.response.DetailResponse> GetDetailStories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "stories")
    @retrofit2.http.Multipart()
    public abstract retrofit2.Call<com.dicoding.picodiploma.mystoryapp2.model.response.UploadStoriesResponse> UploadStories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "description")
    okhttp3.RequestBody description, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part file);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "stories")
    public abstract retrofit2.Call<com.dicoding.picodiploma.mystoryapp2.model.response.StoriesResponse> getLocationStories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @retrofit2.http.Query(value = "location")
    int location);
}