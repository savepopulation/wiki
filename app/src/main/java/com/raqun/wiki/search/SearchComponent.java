package com.raqun.wiki.search;

import android.support.annotation.NonNull;

import com.raqun.wiki.data.source.SearchRepositoryComponent;
import com.raqun.wiki.util.FragmentScoped;

import dagger.Component;

/**
 * Created by tyln on 21.08.16.
 */

@FragmentScoped
@Component(dependencies = SearchRepositoryComponent.class, modules = SearchPresenterModule.class)
interface SearchComponent {
    void inject(@NonNull SearchActivity activity);
}
