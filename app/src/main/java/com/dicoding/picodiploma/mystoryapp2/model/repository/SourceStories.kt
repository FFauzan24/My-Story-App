package com.dicoding.picodiploma.mystoryapp2.model.repository

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiService
import com.dicoding.picodiploma.mystoryapp2.model.response.Story

class SourceStories (private val apiService: ApiService, private val token: String): PagingSource<Int, Story>(){

    override fun getRefreshKey(state: PagingState<Int, Story>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Story> {
        return try{
            val page = params.key ?: PAGE_INDEX
            val responseData = apiService.GetAllStories(token, page, params.loadSize)
            val prevkey = if (page == PAGE_INDEX) null else page -1
            val nextkey = if (responseData.listStory.isNullOrEmpty()) null else page + 1

            LoadResult.Page(
                data = responseData.listStory as List,
                prevKey = prevkey,
                nextKey = nextkey
            )
        }
        catch (e: Exception){
            e.printStackTrace()
            Log.e(SourceStories::class.java.simpleName, "Failure get Data ${e.message}")
            LoadResult.Error(e)
        }
    }

    private companion object{
        const val PAGE_INDEX = 1
    }
}