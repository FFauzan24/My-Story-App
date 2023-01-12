package com.dicoding.picodiploma.mystoryapp2.model.repository;

import com.dicoding.picodiploma.mystoryapp2.model.network.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegisterRepository_Factory implements Factory<RegisterRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public RegisterRepository_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public RegisterRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static RegisterRepository_Factory create(Provider<ApiService> apiServiceProvider) {
    return new RegisterRepository_Factory(apiServiceProvider);
  }

  public static RegisterRepository newInstance(ApiService apiService) {
    return new RegisterRepository(apiService);
  }
}
