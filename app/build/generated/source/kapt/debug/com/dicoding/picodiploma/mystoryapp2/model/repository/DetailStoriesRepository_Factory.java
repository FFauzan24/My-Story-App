package com.dicoding.picodiploma.mystoryapp2.model.repository;

import android.content.Context;
import com.dicoding.picodiploma.mystoryapp2.model.network.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailStoriesRepository_Factory implements Factory<DetailStoriesRepository> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<Context> contextProvider;

  public DetailStoriesRepository_Factory(Provider<ApiService> apiServiceProvider,
      Provider<Context> contextProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public DetailStoriesRepository get() {
    return newInstance(apiServiceProvider.get(), contextProvider.get());
  }

  public static DetailStoriesRepository_Factory create(Provider<ApiService> apiServiceProvider,
      Provider<Context> contextProvider) {
    return new DetailStoriesRepository_Factory(apiServiceProvider, contextProvider);
  }

  public static DetailStoriesRepository newInstance(ApiService apiService, Context context) {
    return new DetailStoriesRepository(apiService, context);
  }
}
