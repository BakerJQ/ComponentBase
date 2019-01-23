package com.bakerj.component.demo.component1;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bakerj.component.service.component1.Component1Service;

@Route(path = Component1Service.IGetNameService.NAME_SERVICE, name = "Component1 Name Service")
public class NameService implements Component1Service.IGetNameService {
    @Override
    public String getName() {
        return "I'm Component1";
    }

    @Override
    public void init(Context context) {
        Toast.makeText(context, "Component1 Name Service Init", Toast.LENGTH_SHORT).show();
    }
}
