package com.dicoding.picodiploma.mystoryapp2.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.dicoding.picodiploma.mystoryapp2.databinding.ActivityRegisterBinding;
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData;
import com.dicoding.picodiploma.mystoryapp2.viewmodel.RegisterViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/dicoding/picodiploma/mystoryapp2/databinding/ActivityRegisterBinding;", "registerViewModel", "Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/RegisterViewModel;", "getRegisterViewModel", "()Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/RegisterViewModel;", "registerViewModel$delegate", "Lkotlin/Lazy;", "closeKeyboard", "", "loading", "isLoading", "", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private com.dicoding.picodiploma.mystoryapp2.databinding.ActivityRegisterBinding binding;
    private final kotlin.Lazy registerViewModel$delegate = null;
    
    public RegisterActivity() {
        super();
    }
    
    private final com.dicoding.picodiploma.mystoryapp2.viewmodel.RegisterViewModel getRegisterViewModel() {
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
    
    private final void loading(boolean isLoading) {
    }
}