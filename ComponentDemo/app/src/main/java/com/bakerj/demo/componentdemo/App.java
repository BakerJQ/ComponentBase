package com.bakerj.demo.componentdemo;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.service.DegradeService;
import com.bakerj.base.router.DegradeServiceImpl;
import com.bakerj.component.base.ComponentBaseApplication;
import com.blankj.utilcode.util.ToastUtils;

public class App extends ComponentBaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        DegradeServiceImpl.setDegradeService(new DegradeService() {
            @Override
            public void onLost(Context context, Postcard postcard) {
                if (postcard.getUri() != null) {
                    ToastUtils.showShort(postcard.getUri().toString());
                } else if (postcard.getPath() != null) {
                    ToastUtils.showShort(postcard.getPath());
                }
            }

            @Override
            public void init(Context context) {
                ToastUtils.showShort("DegradeService Init");
            }
        });
    }
}
