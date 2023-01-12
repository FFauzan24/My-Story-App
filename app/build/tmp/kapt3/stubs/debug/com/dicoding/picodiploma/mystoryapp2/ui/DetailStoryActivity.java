package com.dicoding.picodiploma.mystoryapp2.ui;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.dicoding.picodiploma.mystoryapp2.databinding.ActivityDetailStoryBinding;
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData;
import com.dicoding.picodiploma.mystoryapp2.viewmodel.DetailViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/DetailStoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/dicoding/picodiploma/mystoryapp2/databinding/ActivityDetailStoryBinding;", "detailViewModel", "Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/DetailViewModel;", "getDetailViewModel", "()Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/DetailViewModel;", "detailViewModel$delegate", "Lkotlin/Lazy;", "id", "", "loading", "", "isLoading", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "viewDetailStory", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailStoryActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dicoding.picodiploma.mystoryapp2.databinding.ActivityDetailStoryBinding binding;
    private final kotlin.Lazy detailViewModel$delegate = null;
    private java.lang.String id = "0";
    @org.jetbrains.annotations.NotNull()
    public static final com.dicoding.picodiploma.mystoryapp2.ui.DetailStoryActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ID = "extra_name";
    
    public DetailStoryActivity() {
        super();
    }
    
    private final com.dicoding.picodiploma.mystoryapp2.viewmodel.DetailViewModel getDetailViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final void viewDetailStory() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void loading(boolean isLoading) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/DetailStoryActivity$Companion;", "", "()V", "EXTRA_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}