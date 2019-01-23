package com.bakerj.component.service.component2;

import com.alibaba.android.arouter.launcher.ARouter;

public class Component2Navigation {
    public static void toMain() {
        ARouter.getInstance().build(Component2PathConstants.COMPONENT2_MAIN).navigation();
    }
}
