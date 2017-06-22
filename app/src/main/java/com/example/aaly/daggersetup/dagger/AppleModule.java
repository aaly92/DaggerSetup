package com.example.aaly.daggersetup.dagger;

import dagger.Module;
import dagger.Provides;

@Module
class AppleModule {
    @Provides
    public String providesApple() {
        return "Apple";
    }
}
