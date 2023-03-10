// Generated by view binder compiler. Do not edit!
package com.dicoding.picodiploma.mystoryapp2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.picodiploma.mystoryapp2.R;
import com.dicoding.picodiploma.mystoryapp2.ui.customUI.CustomButton;
import com.dicoding.picodiploma.mystoryapp2.ui.customUI.CustomButton2;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddStoriesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CustomButton addStory;

  @NonNull
  public final CustomButton2 btnUpload;

  @NonNull
  public final ImageView image;

  @NonNull
  public final EditText inputDeskripsi;

  @NonNull
  public final LinearLayout linear;

  @NonNull
  public final ProgressBar pbarLogin;

  @NonNull
  public final CustomButton2 takePhoto;

  @NonNull
  public final TextView text1;

  @NonNull
  public final TextView text2;

  private ActivityAddStoriesBinding(@NonNull ConstraintLayout rootView,
      @NonNull CustomButton addStory, @NonNull CustomButton2 btnUpload, @NonNull ImageView image,
      @NonNull EditText inputDeskripsi, @NonNull LinearLayout linear,
      @NonNull ProgressBar pbarLogin, @NonNull CustomButton2 takePhoto, @NonNull TextView text1,
      @NonNull TextView text2) {
    this.rootView = rootView;
    this.addStory = addStory;
    this.btnUpload = btnUpload;
    this.image = image;
    this.inputDeskripsi = inputDeskripsi;
    this.linear = linear;
    this.pbarLogin = pbarLogin;
    this.takePhoto = takePhoto;
    this.text1 = text1;
    this.text2 = text2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddStoriesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddStoriesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_stories, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddStoriesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addStory;
      CustomButton addStory = ViewBindings.findChildViewById(rootView, id);
      if (addStory == null) {
        break missingId;
      }

      id = R.id.btnUpload;
      CustomButton2 btnUpload = ViewBindings.findChildViewById(rootView, id);
      if (btnUpload == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.inputDeskripsi;
      EditText inputDeskripsi = ViewBindings.findChildViewById(rootView, id);
      if (inputDeskripsi == null) {
        break missingId;
      }

      id = R.id.linear;
      LinearLayout linear = ViewBindings.findChildViewById(rootView, id);
      if (linear == null) {
        break missingId;
      }

      id = R.id.pbar_login;
      ProgressBar pbarLogin = ViewBindings.findChildViewById(rootView, id);
      if (pbarLogin == null) {
        break missingId;
      }

      id = R.id.takePhoto;
      CustomButton2 takePhoto = ViewBindings.findChildViewById(rootView, id);
      if (takePhoto == null) {
        break missingId;
      }

      id = R.id.text1;
      TextView text1 = ViewBindings.findChildViewById(rootView, id);
      if (text1 == null) {
        break missingId;
      }

      id = R.id.text2;
      TextView text2 = ViewBindings.findChildViewById(rootView, id);
      if (text2 == null) {
        break missingId;
      }

      return new ActivityAddStoriesBinding((ConstraintLayout) rootView, addStory, btnUpload, image,
          inputDeskripsi, linear, pbarLogin, takePhoto, text1, text2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
