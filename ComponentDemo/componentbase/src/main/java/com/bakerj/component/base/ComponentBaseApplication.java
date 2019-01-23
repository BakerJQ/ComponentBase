package com.bakerj.component.base;


import androidx.multidex.MultiDexApplication;

public abstract class ComponentBaseApplication extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Component.init(this);
    }
}
