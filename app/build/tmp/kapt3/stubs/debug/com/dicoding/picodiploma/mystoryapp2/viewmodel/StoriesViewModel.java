package com.dicoding.picodiploma.mystoryapp2.viewmodel;

import androidx.lifecycle.*;
import androidx.paging.PagingData;
import com.dicoding.picodiploma.mystoryapp2.model.repository.AllStoryRepository;
import com.dicoding.picodiploma.mystoryapp2.model.response.Story;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Suppress(names = {"DEPRECATION"})
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/StoriesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/dicoding/picodiploma/mystoryapp2/model/repository/AllStoryRepository;", "(Lcom/dicoding/picodiploma/mystoryapp2/model/repository/AllStoryRepository;)V", "showAllStories", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lcom/dicoding/picodiploma/mystoryapp2/model/response/Story;", "app_debug"})
public final class StoriesViewModel extends androidx.lifecycle.ViewModel {
    private final com.dicoding.picodiploma.mystoryapp2.model.repository.AllStoryRepository repository = null;
    
    @javax.inject.Inject()
    public StoriesViewModel(@org.jetbrains.annotations.NotNull()
    com.dicoding.picodiploma.mystoryapp2.model.repository.AllStoryRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<com.dicoding.picodiploma.mystoryapp2.model.response.Story>> showAllStories() {
        return null;
    }
}