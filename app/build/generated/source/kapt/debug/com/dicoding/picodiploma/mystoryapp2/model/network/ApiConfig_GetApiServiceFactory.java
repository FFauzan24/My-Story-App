package com.dicoding.picodiploma.mystoryapp2.model.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class ApiConfig_GetApiServiceFactory implements Factory<ApiService> {
  @Override
  public ApiService get() {
    return getApiService();
  }

  public static ApiConfig_GetApiServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiService getApiService() {
    return Preconditions.checkNotNullFromProvides(ApiConfig.INSTANCE.getApiService());
  }

  private static final class InstanceHolder {
    private static final ApiConfig_GetApiServiceFactory INSTANCE = new ApiConfig_GetApiServiceFactory();
  }
}
