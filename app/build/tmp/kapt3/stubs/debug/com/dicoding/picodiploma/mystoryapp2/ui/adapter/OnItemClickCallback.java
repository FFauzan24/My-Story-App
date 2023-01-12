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

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/adapter/OnItemClickCallback;", "", "onItemClicked", "", "id", "", "app_debug"})
public abstract interface OnItemClickCallback {
    
    public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
}