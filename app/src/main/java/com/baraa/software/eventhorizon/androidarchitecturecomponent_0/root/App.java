package com.baraa.software.eventhorizon.androidarchitecturecomponent_0.root;

import android.app.Application;

import com.baraa.software.eventhorizon.androidarchitecturecomponent_0.http.module.MovieApiModule;

public class App extends Application {
    ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .movieApiModule(new MovieApiModule())
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return component;
    }
}
