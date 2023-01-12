package com.dicoding.picodiploma.mystoryapp2.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.dicoding.picodiploma.mystoryapp2.databinding.ActivityAddStoriesBinding;
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData;
import com.dicoding.picodiploma.mystoryapp2.viewmodel.AddStoryViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u0015H\u0003J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/AddStoriesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "addStoryViewModel", "Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/AddStoryViewModel;", "getAddStoryViewModel", "()Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/AddStoryViewModel;", "addStoryViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/dicoding/picodiploma/mystoryapp2/databinding/ActivityAddStoriesBinding;", "currentPhotoPath", "", "getFile", "Ljava/io/File;", "launcherCamera", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "launcherGallery", "loading", "", "isLoading", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "permissionGranted", "reduceImage", "file", "startTakePhoto", "uploadImage", "uploadValidation", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddStoriesActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.dicoding.picodiploma.mystoryapp2.databinding.ActivityAddStoriesBinding binding;
    private java.lang.String currentPhotoPath;
    private final kotlin.Lazy addStoryViewModel$delegate = null;
    private java.io.File getFile;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcherCamera = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcherGallery = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.dicoding.picodiploma.mystoryapp2.ui.AddStoriesActivity.Companion Companion = null;
    private static final java.lang.String[] REQUIRED_PERMISSIONS = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final int REQUEST_CODE_PERMISSION = 10;
    
    public AddStoriesActivity() {
        super();
    }
    
    private final com.dicoding.picodiploma.mystoryapp2.viewmodel.AddStoryViewModel getAddStoryViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"QueryPermissionsNeeded"})
    private final void startTakePhoto() {
    }
    
    private final void uploadImage() {
    }
    
    private final boolean permissionGranted() {
        return false;
    }
    
    private final void uploadValidation() {
    }
    
    private final java.io.File reduceImage(java.io.File file) {
        return null;
    }
    
    private final void loading(boolean isLoading) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/AddStoriesActivity$Companion;", "", "()V", "REQUEST_CODE_PERMISSION", "", "REQUIRED_PERMISSIONS", "", "", "[Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}