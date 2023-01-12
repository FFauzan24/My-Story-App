package com.dicoding.picodiploma.mystoryapp2.viewmodel;

import com.dicoding.picodiploma.mystoryapp2.model.repository.DetailStoriesRepository;
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
public final class DetailViewModel_Factory implements Factory<DetailViewModel> {
  private final Provider<DetailStoriesRepository> repositoryProvider;

  public DetailViewModel_Factory(Provider<DetailStoriesRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DetailViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static DetailViewModel_Factory create(
      Provider<DetailStoriesRepository> repositoryProvider) {
    return new DetailViewModel_Factory(repositoryProvider);
  }

  public static DetailViewModel newInstance(DetailStoriesRepository repository) {
    return new DetailViewModel(repository);
  }
}
