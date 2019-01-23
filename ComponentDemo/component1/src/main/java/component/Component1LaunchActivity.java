package component;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.bakerj.component.demo.component1.R;
import com.bakerj.component.service.component1.Component1Navigation;

public class Component1LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component1_launch);
        Component1Navigation.toMain();
    }
}
