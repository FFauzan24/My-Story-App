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
public final class AllStoryRepository_Factory implements Factory<AllStoryRepository> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<Context> contextProvider;

  public AllStoryRepository_Factory(Provider<ApiService> apiServiceProvider,
      Provider<Context> contextProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public AllStoryRepository get() {
    return newInstance(apiServiceProvider.get(), contextProvider.get());
  }

  public static AllStoryRepository_Factory create(Provider<ApiService> apiServiceProvider,
      Provider<Context> contextProvider) {
    return new AllStoryRepository_Factory(apiServiceProvider, contextProvider);
  }

  public static AllStoryRepository newInstance(ApiService apiService, Context context) {
    return new AllStoryRepository(apiService, context);
  }
}
