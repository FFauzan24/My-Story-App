package com.dicoding.picodiploma.mystoryapp2.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.picodiploma.mystoryapp2.databinding.LoadingStateBinding
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData

class LoadingStateAdapter(private val retry: () -> Unit) : LoadStateAdapter<LoadingStateAdapter.LoadingStateViewHolder>() {

    inner class LoadingStateViewHolder(var binding: LoadingStateBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onBindViewHolder(holder: LoadingStateViewHolder, loadState: LoadState) {
        holder.apply {
            itemView.apply {
                binding.apply {
                    if (loadState is LoadState.Error) errorText.text = loadState.error.localizedMessage
                    progressBar.isVisible = loadState is LoadState.Loading
                    btnReload.isVisible = loadState is LoadState.Error
                    errorText.isVisible = loadState is LoadState.Error

                    btnReload.setOnClickListener {
                        retry.invoke()
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        loadState: LoadState
    ): LoadingStateViewHolder {
        val binding = LoadingStateBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LoadingStateViewHolder(binding)
    }


}