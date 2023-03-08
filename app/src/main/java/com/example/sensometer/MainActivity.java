package com.example.sensometer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button proximityBtn = findViewById(R.id.proximityBtn);
        Button gpsBtn = findViewById(R.id.gpsBtn);
        Button lightBtn = findViewById(R.id.lightBtn);
        Button pressureBtn = findViewById(R.id.pressureBtn);
        Button accelerometerBtn = findViewById(R.id.accelerometerBtn);
        Button magnetometerBtn = findViewById(R.id.magnetometerBtn);

        proximityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), proximityActivity.class);
                startActivity(intent);
                finish();
            }
        });

        gpsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), gpsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        lightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), lightActivity.class);
                startActivity(intent);
                finish();
            }
        });

        pressureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pressureActivity.class);
                startActivity(intent);
                finish();
            }
        });

        accelerometerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), accelerometerActivity.class);
                startActivity(intent);
                finish();
            }
        });

        magnetometerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), magnetometerActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
    }
}