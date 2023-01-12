package com.dicoding.picodiploma.mystoryapp2.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.dicoding.picodiploma.mystoryapp2.R;
import com.dicoding.picodiploma.mystoryapp2.databinding.ActivityMapsBinding;
import com.dicoding.picodiploma.mystoryapp2.ui.util.ResultData;
import com.dicoding.picodiploma.mystoryapp2.viewmodel.MapsViewModel;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/dicoding/picodiploma/mystoryapp2/ui/MapsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "binding", "Lcom/dicoding/picodiploma/mystoryapp2/databinding/ActivityMapsBinding;", "boundBuilder", "Lcom/google/android/gms/maps/model/LatLngBounds$Builder;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "mapsViewModel", "Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/MapsViewModel;", "getMapsViewModel", "()Lcom/dicoding/picodiploma/mystoryapp2/viewmodel/MapsViewModel;", "mapsViewModel$delegate", "Lkotlin/Lazy;", "getStoriesLocation", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "p0", "setMarker", "latLon", "Lcom/google/android/gms/maps/model/LatLng;", "creator", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MapsActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.dicoding.picodiploma.mystoryapp2.databinding.ActivityMapsBinding binding;
    private com.google.android.gms.maps.GoogleMap googleMap;
    private final kotlin.Lazy mapsViewModel$delegate = null;
    private final com.google.android.gms.maps.model.LatLngBounds.Builder boundBuilder = null;
    
    public MapsActivity() {
        super();
    }
    
    private final com.dicoding.picodiploma.mystoryapp2.viewmodel.MapsViewModel getMapsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    private final void getStoriesLocation() {
    }
    
    private final void setMarker(com.google.android.gms.maps.model.LatLng latLon, java.lang.String creator) {
    }
}