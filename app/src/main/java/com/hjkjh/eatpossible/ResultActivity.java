package com.hjkjh.eatpossible;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private String mode;
    private String searchStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        this.mode = intent.getExtras().getString("mode");
        this.searchStr = intent.getExtras().getString("search");

        TextView tvSearch = findViewById(R.id.tvSearch);
        ImageView imageView = findViewById(R.id.imgResult);
        TextView textView = findViewById(R.id.tvResult);

        tvSearch.setText(this.searchStr);
        if (this.searchStr.equals("감자")) {
            Drawable drawable = getResources().getDrawable(R.drawable.potato);
            imageView.setImageDrawable(drawable);
            textView.setText("Possible");
        } else {
            Drawable drawable = getResources().getDrawable(R.drawable.unknown);
            imageView.setImageDrawable(drawable);
            textView.setText("Unknown");
        }
    }
}
