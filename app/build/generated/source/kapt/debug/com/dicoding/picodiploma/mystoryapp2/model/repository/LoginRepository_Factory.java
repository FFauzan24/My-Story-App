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
public final class LoginRepository_Factory implements Factory<LoginRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public LoginRepository_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public LoginRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static LoginRepository_Factory create(Provider<ApiService> apiServiceProvider) {
    return new LoginRepository_Factory(apiServiceProvider);
  }

  public static LoginRepository newInstance(ApiService apiService) {
    return new LoginRepository(apiService);
  }
}
