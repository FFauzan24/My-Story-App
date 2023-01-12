package com.dicoding.picodiploma.mystoryapp2.viewmodel;

import com.dicoding.picodiploma.mystoryapp2.model.repository.AllStoryRepository;
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
public final class StoriesViewModel_Factory implements Factory<StoriesViewModel> {
  private final Provider<AllStoryRepository> repositoryProvider;

  public StoriesViewModel_Factory(Provider<AllStoryRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public StoriesViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static StoriesViewModel_Factory create(Provider<AllStoryRepository> repositoryProvider) {
    return new StoriesViewModel_Factory(repositoryProvider);
  }

  public static StoriesViewModel newInstance(AllStoryRepository repository) {
    return new StoriesViewModel(repository);
  }
}
