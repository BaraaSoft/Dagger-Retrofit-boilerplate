package com.baraa.software.eventhorizon.androidarchitecturecomponent_0.root;

import com.baraa.software.eventhorizon.androidarchitecturecomponent_0.MainFragment;
import com.baraa.software.eventhorizon.androidarchitecturecomponent_0.http.module.MovieApiModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, MovieApiModule.class})
public interface ApplicationComponent {
    void inject(MainFragment mainFragment);
}