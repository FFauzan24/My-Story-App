package com.dicoding.picodiploma.mystoryapp2.ui.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.paging.PagingData;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.dicoding.picodiploma.mystoryapp2.model.response.Story;
import com.dicoding.picodiploma.mystoryapp2.databinding.ItemstoryBinding;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0011\u0012B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/adapter/StoriesAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/Story;", "Lcom/dicoding/picodiploma/mystoryapp2/ui/adapter/StoriesAdapter$StoriesViewHolder;", "()V", "onItemClickCallback", "Lcom/dicoding/picodiploma/mystoryapp2/ui/adapter/OnItemClickCallback;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickCallback", "Companion", "StoriesViewHolder", "app_debug"})
public final class StoriesAdapter extends androidx.paging.PagingDataAdapter<com.dicoding.picodiploma.mystoryapp2.model.response.Story, com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter.StoriesViewHolder> {
    private com.dicoding.picodiploma.mystoryapp2.ui.adapter.OnItemClickCallback onItemClickCallback;
    @org.jetbrains.annotations.NotNull()
    public static final com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.dicoding.picodiploma.mystoryapp2.model.response.Story> DIFF_CALLBACK = null;
    
    @javax.inject.Inject()
    public StoriesAdapter() {
        super(null, null, null);
    }
    
    public final void setOnItemClickCallback(@org.jetbrains.annotations.NotNull()
    com.dicoding.picodiploma.mystoryapp2.ui.adapter.OnItemClickCallback onItemClickCallback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter.StoriesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter.StoriesViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/adapter/StoriesAdapter$StoriesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/dicoding/picodiploma/mystoryapp2/databinding/ItemstoryBinding;", "(Lcom/dicoding/picodiploma/mystoryapp2/ui/adapter/StoriesAdapter;Lcom/dicoding/picodiploma/mystoryapp2/databinding/ItemstoryBinding;)V", "bind", "", "stories", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/Story;", "app_debug"})
    public final class StoriesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.dicoding.picodiploma.mystoryapp2.databinding.ItemstoryBinding view = null;
        
        public StoriesViewHolder(@org.jetbrains.annotations.NotNull()
        com.dicoding.picodiploma.mystoryapp2.databinding.ItemstoryBinding view) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.dicoding.picodiploma.mystoryapp2.model.response.Story stories) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/adapter/StoriesAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/Story;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.dicoding.picodiploma.mystoryapp2.model.response.Story> getDIFF_CALLBACK() {
            return null;
        }
    }
}