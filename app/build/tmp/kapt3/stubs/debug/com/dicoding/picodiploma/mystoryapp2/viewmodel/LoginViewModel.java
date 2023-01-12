package com.dicoding.picodiploma.mystoryapp2.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.dicoding.picodiploma.mystoryapp2.model.response.LoginStoriesResponse;
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiConfig;
import com.dicoding.picodiploma.mystoryapp2.model.repository.LoginRepository;
import com.dicoding.picodiploma.mystoryapp2.model.response.User;
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData;
import dagger.hilt.android.lifecycle.HiltViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginRepository", "Lcom/dicoding/picodiploma/mystoryapp2/model/repository/LoginRepository;", "(Lcom/dicoding/picodiploma/mystoryapp2/model/repository/LoginRepository;)V", "userLogin", "Landroidx/lifecycle/LiveData;", "Lcom/dicoding/picodiploma/mystoryapp2/ui/util/ResultData;", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/LoginStoriesResponse;", "email", "", "password", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.dicoding.picodiploma.mystoryapp2.model.repository.LoginRepository loginRepository = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.dicoding.picodiploma.mystoryapp2.model.repository.LoginRepository loginRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData<com.dicoding.picodiploma.mystoryapp2.model.response.LoginStoriesResponse>> userLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
}