package com.hjkjh.eatpossible;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MenuBtnClick(View view) {
        switch (view.getId()) {
            case R.id.pregnantBtn:
                break;
            case R.id.diabetesBtn:
                break;
            case R.id.dogBtn:
                break;
        }
    }
}
