package com.dicoding.picodiploma.mystoryapp2.ui.adapter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class StoriesAdapter_Factory implements Factory<StoriesAdapter> {
  @Override
  public StoriesAdapter get() {
    return newInstance();
  }

  public static StoriesAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StoriesAdapter newInstance() {
    return new StoriesAdapter();
  }

  private static final class InstanceHolder {
    private static final StoriesAdapter_Factory INSTANCE = new StoriesAdapter_Factory();
  }
}
