package com.dicoding.picodiploma.mystoryapp2.viewModel

import androidx.lifecycle.LiveData
import androidx.paging.PagingData
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.dicoding.picodiploma.mystoryapp2.model.response.Story

class PageResource: PagingSource<Int, LiveData<List<Story>>>(){
    companion object{
        fun snapshot(item: List<Story>): PagingData<Story> {
            return PagingData.from(item)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, LiveData<List<Story>>> {
        return LoadResult.Page(emptyList(), 0, 1)
    }

    override fun getRefreshKey(state: PagingState<Int, LiveData<List<Story>>>): Int? {
        return 0
    }
}