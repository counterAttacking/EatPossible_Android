package com.hjkjh.eatpossible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MenuBtnClick(View view) {
        Button btn = findViewById(view.getId());
        String btnText = btn.getText().toString();

        Intent intent = new Intent(this.getApplicationContext(), SearchActivity.class);
        intent.putExtra("mode", btnText);

        startActivity(intent);
    }
}
