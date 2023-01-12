package com.dicoding.picodiploma.mystoryapp2.model.repository;

import android.content.Context;
import android.preference.PreferenceManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiService;
import com.dicoding.picodiploma.mystoryapp2.model.response.DetailResponse;
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData;
import dagger.hilt.android.qualifiers.ApplicationContext;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/model/repository/DetailStoriesRepository;", "", "apiService", "Lcom/dicoding/picodiploma/mystoryapp2/model/network/ApiService;", "context", "Landroid/content/Context;", "(Lcom/dicoding/picodiploma/mystoryapp2/model/network/ApiService;Landroid/content/Context;)V", "token", "", "getToken$annotations", "()V", "getDetailStories", "Landroidx/lifecycle/LiveData;", "Lcom/dicoding/picodiploma/mystoryapp2/ui/util/ResultData;", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/DetailResponse;", "id", "app_debug"})
public final class DetailStoriesRepository {
    private final com.dicoding.picodiploma.mystoryapp2.model.network.ApiService apiService = null;
    private final android.content.Context context = null;
    private final java.lang.String token = null;
    
    @javax.inject.Inject()
    public DetailStoriesRepository(@org.jetbrains.annotations.NotNull()
    com.dicoding.picodiploma.mystoryapp2.model.network.ApiService apiService, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Deprecated()
    private static void getToken$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData<com.dicoding.picodiploma.mystoryapp2.model.response.DetailResponse>> getDetailStories(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
}