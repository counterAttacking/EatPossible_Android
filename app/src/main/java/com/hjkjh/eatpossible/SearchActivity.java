package com.hjkjh.eatpossible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {
    private String mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent intent = getIntent();
        this.mode = intent.getExtras().getString("mode");

        TextView tvMode = findViewById(R.id.tvMode);
        tvMode.setText(this.mode);
    }

    public void SearchBtnClick(View view) {
        EditText etInput = findViewById(R.id.etInput);
        String searchStr = etInput.getText().toString();

        if (TextUtils.isEmpty(searchStr)) {
            Toast.makeText(this, "검색어를 입력하세요", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this.getApplicationContext(), ResultActivity.class);
        intent.putExtra("mode", mode);
        intent.putExtra("search", searchStr);

        startActivity(intent);
    }
}
