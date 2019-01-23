package com.bakerj.component.demo.component1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bakerj.component.service.component1.Component1PathConstants;

@Route(path = Component1PathConstants.COMPONENT1_MAIN)
public class Component1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component1);
    }
}
