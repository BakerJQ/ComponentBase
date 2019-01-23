package component;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.bakerj.component.service.component2.Component2Navigation;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Component2Navigation.toMain();
    }
}
