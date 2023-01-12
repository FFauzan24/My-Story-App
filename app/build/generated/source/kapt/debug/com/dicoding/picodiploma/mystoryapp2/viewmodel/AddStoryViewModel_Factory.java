package com.dicoding.picodiploma.mystoryapp2.viewmodel;

import com.dicoding.picodiploma.mystoryapp2.model.repository.AddStoriesRepository;
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
public final class AddStoryViewModel_Factory implements Factory<AddStoryViewModel> {
  private final Provider<AddStoriesRepository> repositoryProvider;

  public AddStoryViewModel_Factory(Provider<AddStoriesRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AddStoryViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static AddStoryViewModel_Factory create(
      Provider<AddStoriesRepository> repositoryProvider) {
    return new AddStoryViewModel_Factory(repositoryProvider);
  }

  public static AddStoryViewModel newInstance(AddStoriesRepository repository) {
    return new AddStoryViewModel(repository);
  }
}
