package com.dicoding.picodiploma.mystoryapp2.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.dicoding.picodiploma.mystoryapp2.R;
import com.dicoding.picodiploma.mystoryapp2.databinding.ActivityLoginBinding;
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData;
import com.dicoding.picodiploma.mystoryapp2.viewmodel.LoginViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/dicoding/picodiploma/mystoryapp2/databinding/ActivityLoginBinding;", "inputPassword", "Lcom/dicoding/picodiploma/mystoryapp2/ui/customUI/CustomPassword;", "loginViewModel", "Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/LoginViewModel;", "getLoginViewModel", "()Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/LoginViewModel;", "loginViewModel$delegate", "Lkotlin/Lazy;", "closeKeyboard", "", "loading", "isLoading", "", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "playAnimation", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private com.dicoding.picodiploma.mystoryapp2.databinding.ActivityLoginBinding binding;
    private final kotlin.Lazy loginViewModel$delegate = null;
    private com.dicoding.picodiploma.mystoryapp2.ui.customUI.CustomPassword inputPassword;
    
    public LoginActivity() {
        super();
    }
    
    private final com.dicoding.picodiploma.mystoryapp2.viewmodel.LoginViewModel getLoginViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void closeKeyboard() {
    }
    
    private final void playAnimation() {
    }
    
    private final void loading(boolean isLoading) {
    }
}