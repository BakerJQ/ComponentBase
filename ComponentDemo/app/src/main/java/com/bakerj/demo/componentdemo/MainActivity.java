package com.bakerj.demo.componentdemo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bakerj.component.service.component1.Component1Navigation;
import com.bakerj.component.service.component1.Component1Service;
import com.bakerj.component.service.component2.Component2Navigation;

public class MainActivity extends AppCompatActivity {
    @Autowired(name = Component1Service.IGetNameService.NAME_SERVICE)
    Component1Service.IGetNameService nameService;
    @Autowired(name = "/service/test")
    Component1Service.IGetNameService nameServiceTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(v -> Component1Navigation.toMain());
        findViewById(R.id.button_name).setOnClickListener(v -> Toast.makeText(MainActivity.this,
                nameService.getName(), Toast.LENGTH_SHORT).show());
        findViewById(R.id.button2).setOnClickListener(v -> Component2Navigation.toMain());
        findViewById(R.id.button3).setOnClickListener(v -> ARouter.getInstance().build("/aaa/aaa").navigation());

    }
}
