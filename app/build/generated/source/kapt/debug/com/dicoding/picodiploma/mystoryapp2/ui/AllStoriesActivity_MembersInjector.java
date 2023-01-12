package com.dicoding.picodiploma.mystoryapp2.ui;

import com.dicoding.picodiploma.mystoryapp2.ui.adapter.StoriesAdapter;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AllStoriesActivity_MembersInjector implements MembersInjector<AllStoriesActivity> {
  private final Provider<StoriesAdapter> storiesAdapterProvider;

  public AllStoriesActivity_MembersInjector(Provider<StoriesAdapter> storiesAdapterProvider) {
    this.storiesAdapterProvider = storiesAdapterProvider;
  }

  public static MembersInjector<AllStoriesActivity> create(
      Provider<StoriesAdapter> storiesAdapterProvider) {
    return new AllStoriesActivity_MembersInjector(storiesAdapterProvider);
  }

  @Override
  public void injectMembers(AllStoriesActivity instance) {
    injectStoriesAdapter(instance, storiesAdapterProvider.get());
  }

  @InjectedFieldSignature("com.dicoding.picodiploma.mystoryapp2.ui.AllStoriesActivity.storiesAdapter")
  public static void injectStoriesAdapter(AllStoriesActivity instance,
      StoriesAdapter storiesAdapter) {
    instance.storiesAdapter = storiesAdapter;
  }
}
