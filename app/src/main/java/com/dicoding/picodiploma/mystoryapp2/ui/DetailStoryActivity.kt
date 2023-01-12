package com.dicoding.picodiploma.mystoryapp2.ui

import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.MenuItem
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.dicoding.picodiploma.mystoryapp2.databinding.ActivityDetailStoryBinding
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.viewmodel.DetailViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailStoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailStoryBinding
    private val detailViewModel: DetailViewModel by viewModels()

    private var id: String = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailStoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Detail Stories"
        loading(true)


        if (intent.extras != null){
            id = intent.getStringExtra(EXTRA_ID).toString()
        }

        viewDetailStory()
    }

    @Suppress("DEPRECATION")
    private fun viewDetailStory() {
        detailViewModel.getDetailStories(id).observe(this){ detailResponse ->
            when(detailResponse) {
                is ResultData.Loading ->{
                    loading(true)
                }
                is ResultData.Success ->{
                    loading(false)
                    with(binding){
                        Glide.with(this@DetailStoryActivity)
                            .load(detailResponse.data?.story?.photoUrl)
                            .into(userImage)
                        idUser.text = detailResponse.data?.story?.name
                        description.text = detailResponse.data?.story?.description
                    }
                }
                else ->{
                    loading(false)
                    if (detailResponse.code == 401){
                        PreferenceManager.getDefaultSharedPreferences(this).edit().clear().apply()
                        val intentLogin = Intent(this@DetailStoryActivity, LoginActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(intentLogin)
                        finish()

                    }
                }
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            super.onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun loading(isLoading: Boolean) {
        if(isLoading) binding.pbarLogin.visibility = View.VISIBLE
        else binding.pbarLogin.visibility = View.GONE
    }

    companion object{
        const val EXTRA_ID = "extra_name"
    }

}