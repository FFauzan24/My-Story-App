package com.dicoding.picodiploma.mystoryapp2.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.preference.PreferenceManager
import android.provider.MediaStore
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider

import com.dicoding.picodiploma.mystoryapp2.databinding.ActivityAddStoriesBinding
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData
import com.dicoding.picodiploma.mystoryapp2.ui.util.createTempFile
import com.dicoding.picodiploma.mystoryapp2.ui.util.uriToFile
import com.dicoding.picodiploma.mystoryapp2.viewmodel.AddStoryViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream

@AndroidEntryPoint
class AddStoriesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAddStoriesBinding
    private lateinit var currentPhotoPath: String
    private val addStoryViewModel: AddStoryViewModel by viewModels()

    private var getFile: File? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddStoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Add Stories"

        if (!permissionGranted()){
            ActivityCompat.requestPermissions(
                this,
                REQUIRED_PERMISSIONS,
                REQUEST_CODE_PERMISSION
            )
        }
        binding.btnUpload.setOnClickListener{
            uploadImage()
        }
        binding.takePhoto.setOnClickListener{
            startTakePhoto()
        }
        binding.addStory.setOnClickListener{
            uploadValidation()
        }
    }

    @SuppressLint("QueryPermissionsNeeded")
    private fun startTakePhoto() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        intent.resolveActivity(packageManager)

        createTempFile(application).also {
            val photoURI: Uri = FileProvider.getUriForFile(
                this@AddStoriesActivity,
                "com.dicoding.picodiploma.mystoryapp2",
                it
            )
            currentPhotoPath = it.absolutePath
            intent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
            launcherCamera.launch(intent)
        }
    }

    private val launcherCamera = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ){
        if (it.resultCode == RESULT_OK){
            val myFile = File(currentPhotoPath)
            getFile = reduceImage(myFile)
            val result = BitmapFactory.decodeFile(myFile.path)
            binding.image.setImageBitmap(result)

        }
    }

    private fun uploadImage(){
        val intent = Intent()
        intent.action = Intent.ACTION_GET_CONTENT
        intent.type = "image/*"
        val chooser = Intent.createChooser(intent, "Choose an Image")
        launcherGallery.launch(chooser)
    }

    private val launcherGallery = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ){  result ->
        if (result.resultCode == RESULT_OK){
            val selectedImg: Uri = result.data?.data as Uri
            val myFile = uriToFile(selectedImg, this@AddStoriesActivity)
            getFile = reduceImage(myFile)
            binding.image.setImageURI(selectedImg)
        }
    }


    private fun permissionGranted(): Boolean = REQUIRED_PERMISSIONS.all{
        ContextCompat.checkSelfPermission(baseContext, it) == PackageManager.PERMISSION_GRANTED

    }

    private fun uploadValidation(){
        val file = getFile as File
        val description = binding.inputDeskripsi.text.toString().trim()
        if (description.isEmpty()){
            binding.inputDeskripsi.error = "Deskripsi Tidak Boleh Kosong"
            Toast.makeText(this, "Deskripsi Tidak Boleh Kosong", Toast.LENGTH_SHORT).show()
        }
        if (getFile == null || !getFile!!.exists()){
            Toast.makeText(this, "Foto Tidak Boleh Kosong", Toast.LENGTH_SHORT).show()
        }

        loading(true)

        addStoryViewModel.addStory(description, file).observe(this){ addStoryResponse ->
            when(addStoryResponse){
                is ResultData.Loading -> {
                    loading(true)
                }
                is ResultData.Success -> {
                    loading(false)
                    val intentStories = Intent(this, AllStoriesActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(intentStories)
                    finish()
                }
                else -> {
                    loading(false)
                    if (addStoryResponse.code == 401){
                        Toast.makeText(this@AddStoriesActivity, "Token Expired, Please Login Again", Toast.LENGTH_SHORT).show()
                        val loginIntent = Intent(this@AddStoriesActivity, LoginActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        PreferenceManager.getDefaultSharedPreferences(this@AddStoriesActivity).edit().clear().apply()
                        startActivity(loginIntent)
                        finish()
                    }
                }
            }
        }
    }

    private fun reduceImage(file: File):File{
        val bitmap = BitmapFactory.decodeFile(file.path)
        var compressQuality = 100
        var streamLength : Int
        do{
            val bmpStream = ByteArrayOutputStream()
            bitmap.compress(Bitmap.CompressFormat.JPEG, compressQuality, bmpStream)
            val bmpPicByteArray = bmpStream.toByteArray()
            streamLength = bmpPicByteArray.size
            compressQuality -= 5
        } while (streamLength > 1000000)
        bitmap.compress(Bitmap.CompressFormat.JPEG, compressQuality, FileOutputStream(file))
        return file

    }

    private fun loading(isLoading: Boolean) {
        if(isLoading) binding.pbarLogin.visibility = View.VISIBLE
        else binding.pbarLogin.visibility = View.GONE
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            super.onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }


    companion object{
        private val REQUIRED_PERMISSIONS = arrayOf(android.Manifest.permission.CAMERA, android.Manifest.permission.READ_EXTERNAL_STORAGE, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
        private const val REQUEST_CODE_PERMISSION = 10
    }
}