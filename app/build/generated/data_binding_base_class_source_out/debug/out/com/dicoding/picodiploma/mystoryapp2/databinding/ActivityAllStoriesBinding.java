// Generated by view binder compiler. Do not edit!
package com.dicoding.picodiploma.mystoryapp2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.picodiploma.mystoryapp2.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAllStoriesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton addStory;

  @NonNull
  public final Button btnReload;

  @NonNull
  public final TextView error;

  @NonNull
  public final RelativeLayout loadError;

  @NonNull
  public final ProgressBar pbarLogin;

  @NonNull
  public final RecyclerView rvStories;

  private ActivityAllStoriesBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton addStory, @NonNull Button btnReload, @NonNull TextView error,
      @NonNull RelativeLayout loadError, @NonNull ProgressBar pbarLogin,
      @NonNull RecyclerView rvStories) {
    this.rootView = rootView;
    this.addStory = addStory;
    this.btnReload = btnReload;
    this.error = error;
    this.loadError = loadError;
    this.pbarLogin = pbarLogin;
    this.rvStories = rvStories;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAllStoriesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAllStoriesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_all_stories, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAllStoriesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addStory;
      FloatingActionButton addStory = ViewBindings.findChildViewById(rootView, id);
      if (addStory == null) {
        break missingId;
      }

      id = R.id.btn_reload;
      Button btnReload = ViewBindings.findChildViewById(rootView, id);
      if (btnReload == null) {
        break missingId;
      }

      id = R.id.error;
      TextView error = ViewBindings.findChildViewById(rootView, id);
      if (error == null) {
        break missingId;
      }

      id = R.id.loadError;
      RelativeLayout loadError = ViewBindings.findChildViewById(rootView, id);
      if (loadError == null) {
        break missingId;
      }

      id = R.id.pbar_login;
      ProgressBar pbarLogin = ViewBindings.findChildViewById(rootView, id);
      if (pbarLogin == null) {
        break missingId;
      }

      id = R.id.rvStories;
      RecyclerView rvStories = ViewBindings.findChildViewById(rootView, id);
      if (rvStories == null) {
        break missingId;
      }

      return new ActivityAllStoriesBinding((ConstraintLayout) rootView, addStory, btnReload, error,
          loadError, pbarLogin, rvStories);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}