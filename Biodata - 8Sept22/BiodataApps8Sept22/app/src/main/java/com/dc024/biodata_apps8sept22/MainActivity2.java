package com.dc024.biodata_apps8sept22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvMessage = findViewById(R.id.tvMessage);

        Intent intent = getIntent();
        if (intent != null){
            tvMessage.setText(intent.getStringExtra("EXTRA_TEXT1"));
        }
    }
}