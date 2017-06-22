package com.example.aaly.daggersetup.dagger;

import com.example.aaly.daggersetup.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class AppleFeatureBindingModule {
    @ContributesAndroidInjector(modules = AppleModule.class)
    abstract public MainActivity contributeMainActivityInjector();
}
