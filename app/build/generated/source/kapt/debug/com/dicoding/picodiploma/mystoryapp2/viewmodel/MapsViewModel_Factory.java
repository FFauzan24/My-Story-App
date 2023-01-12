package com.dicoding.picodiploma.mystoryapp2.viewmodel;

import com.dicoding.picodiploma.mystoryapp2.model.repository.MapsRepository;
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
public final class MapsViewModel_Factory implements Factory<MapsViewModel> {
  private final Provider<MapsRepository> repositoryProvider;

  public MapsViewModel_Factory(Provider<MapsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MapsViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static MapsViewModel_Factory create(Provider<MapsRepository> repositoryProvider) {
    return new MapsViewModel_Factory(repositoryProvider);
  }

  public static MapsViewModel newInstance(MapsRepository repository) {
    return new MapsViewModel(repository);
  }
}
