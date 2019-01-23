package com.bakerj.component.service.component1;

import com.alibaba.android.arouter.facade.template.IProvider;

public class Component1Service {
    public interface IGetNameService extends IProvider {
        public static final String NAME_SERVICE = "/component1/service/name";
        String getName();
    }
}
