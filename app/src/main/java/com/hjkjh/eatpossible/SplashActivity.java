package com.hjkjh.eatpossible;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Log.e("Splash Screen", e.toString());
        }
        finish();
    }
}
