package com.bakerj.component.service.component1;

import com.alibaba.android.arouter.launcher.ARouter;

public class Component1Navigation {
    public static void toMain() {
        ARouter.getInstance().build(Component1PathConstants.COMPONENT1_MAIN).navigation();
    }
}
