package com.bakerj.component.demo.component2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bakerj.component.service.component2.Component2PathConstants;

@Route(path = Component2PathConstants.COMPONENT2_MAIN)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.component2_activity_main);
    }
}
