@file:Suppress("DEPRECATION")

package com.dicoding.picodiploma.mystoryapp2.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.preference.PreferenceManager
import com.dicoding.picodiploma.mystoryapp2.databinding.ActivityMainBinding
import com.dicoding.picodiploma.mystoryapp2.model.TOKEN

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val token = PreferenceManager.getDefaultSharedPreferences(this@MainActivity).getString(TOKEN, "")
                if (token != null && token.isNotEmpty()){
                    val intent = Intent(this@MainActivity, AllStoriesActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                else{
                    val intent = Intent(this@MainActivity, LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }, 3000L)
    }
}