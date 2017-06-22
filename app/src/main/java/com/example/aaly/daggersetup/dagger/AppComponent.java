package com.example.aaly.daggersetup.dagger;

import com.example.aaly.daggersetup.App;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = { AndroidInjectionModule.class, AppleFeatureBindingModule.class })
public interface AppComponent {
    void inject(App app);
}
