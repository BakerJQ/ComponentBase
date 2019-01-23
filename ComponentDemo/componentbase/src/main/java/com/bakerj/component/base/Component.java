package com.bakerj.component.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class Component {
    public static void init(Application application) {
        ARouter.init(application);
    }
}
