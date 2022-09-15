package com.dc024.biodata_apps8sept22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.badge.BadgeUtils;

public class MainActivity extends AppCompatActivity {

    private Button btMaps, btPhone, btEmail, btnSendText1;
    private EditText etText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMaps = findViewById(R.id.btMaps);
        btMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:?q=Universitas Dian Nuswantoro");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        btPhone = findViewById(R.id.btPhone);
        btPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:" + "085740151761"));
                startActivity(dialIntent);
            }
        });
        btEmail = findViewById(R.id.btEmail);
        btEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("mailto:" + "ryandhikabintang0@gmail.com"));
                    startActivity(intent);
            }
        });

        etText1 = findViewById(R.id.etText1);
        btnSendText1 = findViewById(R.id.btnSendText1);
        btnSendText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etText1.getText().toString().trim().equalsIgnoreCase("")){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("EXTRA_TEXT1", etText1.getText().toString().trim());
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Pesan Tidak Boleh Kosong" , Toast.LENGTH_SHORT);
                }
            }
        });


    }
}