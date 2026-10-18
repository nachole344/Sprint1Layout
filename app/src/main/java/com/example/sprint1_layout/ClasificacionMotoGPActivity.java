package com.example.sprint1_layout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ClasificacionMotoGPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasificacion_motogp);

        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
    }
}
