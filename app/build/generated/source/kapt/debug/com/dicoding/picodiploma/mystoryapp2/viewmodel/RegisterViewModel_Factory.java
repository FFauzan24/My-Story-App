package com.dicoding.picodiploma.mystoryapp2.viewmodel;

import com.dicoding.picodiploma.mystoryapp2.model.repository.RegisterRepository;
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
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<RegisterRepository> registerRepositoryProvider;

  public RegisterViewModel_Factory(Provider<RegisterRepository> registerRepositoryProvider) {
    this.registerRepositoryProvider = registerRepositoryProvider;
  }

  @Override
  public RegisterViewModel get() {
    return newInstance(registerRepositoryProvider.get());
  }

  public static RegisterViewModel_Factory create(
      Provider<RegisterRepository> registerRepositoryProvider) {
    return new RegisterViewModel_Factory(registerRepositoryProvider);
  }

  public static RegisterViewModel newInstance(RegisterRepository registerRepository) {
    return new RegisterViewModel(registerRepository);
  }
}
