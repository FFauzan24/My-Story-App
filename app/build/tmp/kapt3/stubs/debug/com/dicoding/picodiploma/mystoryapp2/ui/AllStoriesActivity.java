package com.dicoding.picodiploma.mystoryapp2.ui;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dicoding.picodiploma.mystoryapp2.model.response.Story;
import com.dicoding.picodiploma.mystoryapp2.R;
import com.dicoding.picodiploma.mystoryapp2.databinding.ActivityAllStoriesBinding;
import com.dicoding.picodiploma.mystoryapp2.ui.adapter.LoadingStateAdapter;
import com.dicoding.picodiploma.mystoryapp2.ui.adapter.OnItemClickCallback;
import com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter;
import com.dicoding.picodiploma.mystoryapp2.viewmodel.StoriesViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0014J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/AllStoriesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/dicoding/picodiploma/mystoryapp2/databinding/ActivityAllStoriesBinding;", "storiesAdapter", "Lcom/dicoding/picodiploma/mystoryapp2/ui/adapter/StoriesAdapter;", "getStoriesAdapter", "()Lcom/dicoding/picodiploma/mystoryapp2/ui/adapter/StoriesAdapter;", "setStoriesAdapter", "(Lcom/dicoding/picodiploma/mystoryapp2/ui/adapter/StoriesAdapter;)V", "storiesViewModel", "Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/StoriesViewModel;", "getStoriesViewModel", "()Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/StoriesViewModel;", "storiesViewModel$delegate", "Lkotlin/Lazy;", "loading", "", "isLoading", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "showData", "showRecyclerView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AllStoriesActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dicoding.picodiploma.mystoryapp2.databinding.ActivityAllStoriesBinding binding;
    private final kotlin.Lazy storiesViewModel$delegate = null;
    @javax.inject.Inject()
    public com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter storiesAdapter;
    
    public AllStoriesActivity() {
        super();
    }
    
    private final com.dicoding.picodiploma.mystoryapp2.viewmodel.StoriesViewModel getStoriesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter getStoriesAdapter() {
        return null;
    }
    
    public final void setStoriesAdapter(@org.jetbrains.annotations.NotNull()
    com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showData() {
    }
    
    private final void showRecyclerView() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void loading(boolean isLoading) {
    }
}