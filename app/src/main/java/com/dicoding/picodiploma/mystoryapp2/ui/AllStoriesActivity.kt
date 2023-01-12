package com.dicoding.picodiploma.mystoryapp2.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.preference.PreferenceManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.picodiploma.mystoryapp2.model.response.Story
import com.dicoding.picodiploma.mystoryapp2.R

import com.dicoding.picodiploma.mystoryapp2.databinding.ActivityAllStoriesBinding
import com.dicoding.picodiploma.mystoryapp2.ui.adapter.LoadingStateAdapter
import com.dicoding.picodiploma.mystoryapp2.ui.adapter.OnItemClickCallback
import com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter
import com.dicoding.picodiploma.mystoryapp2.viewmodel.StoriesViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AllStoriesActivity :AppCompatActivity(){

    private lateinit var binding: ActivityAllStoriesBinding
    private val storiesViewModel: StoriesViewModel by viewModels()
    @Inject lateinit var storiesAdapter: StoriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllStoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loading(true)
        supportActionBar?.title = "List All Stories"
        showRecyclerView()
        storiesViewModel.showAllStories()
        showData()


        binding.addStory.setOnClickListener{
            startActivity(Intent(this, AddStoriesActivity::class.java))
        }

    }
    private fun showData(){
        storiesViewModel.showAllStories().observe(this) { storiesResponse ->
            storiesAdapter.submitData(lifecycle, storiesResponse)
            storiesAdapter.addLoadStateListener { listenerStories ->
                if (listenerStories.refresh != LoadState.Loading){
                    loading(false)
                }
                if (listenerStories.refresh is LoadState.Error){
                    val data = listenerStories.refresh as LoadState.Error
                    if (data.error.message.equals("HTTP 401 Unauthorized")){
                        Toast.makeText(this@AllStoriesActivity, "Token Expired, Please Login Again", Toast.LENGTH_SHORT).show()
                        val loginIntent = Intent(this@AllStoriesActivity, LoginActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        PreferenceManager.getDefaultSharedPreferences(this@AllStoriesActivity).edit().clear().apply()
                        startActivity(loginIntent)
                        finish()
                    }
                    else{
                        binding.loadError.isVisible = true
                        binding.btnReload.setOnClickListener {
                            binding.loadError.isVisible = false
                            showData()
                        }

                    }

                }

            }
        }
    }

    private fun showRecyclerView(){
        storiesAdapter = StoriesAdapter()
        with(binding){
            rvStories.layoutManager = LinearLayoutManager(this@AllStoriesActivity)
            rvStories.setHasFixedSize(true)
            rvStories.adapter = storiesAdapter.withLoadStateFooter(
                LoadingStateAdapter{
                    storiesAdapter.retry()
                }
            )
        }

        storiesAdapter.setOnItemClickCallback(object : OnItemClickCallback{
            override fun onItemClicked(id: String) {
                Intent(this@AllStoriesActivity, DetailStoryActivity::class.java).also {
                    it.putExtra(DetailStoryActivity.EXTRA_ID, id)
                    startActivity(it)
                }
            }
        })
    }

    override fun onResume() {
        super.onResume()
        if (intent.extras != null){
            val restart = intent.getBooleanExtra("reload", false)
            if (restart){
                storiesViewModel.showAllStories()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.Logout){
            PreferenceManager.getDefaultSharedPreferences(this).edit().clear().apply()
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
        if(item.itemId == R.id.maps){
            startActivity(Intent(this, MapsActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

    private fun loading(isLoading: Boolean) {
        if(isLoading) binding.pbarLogin.visibility = View.VISIBLE
        else binding.pbarLogin.visibility = View.GONE
    }
}