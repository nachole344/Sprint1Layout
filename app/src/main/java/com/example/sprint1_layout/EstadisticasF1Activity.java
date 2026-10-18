package com.example.sprint1_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EstadisticasF1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_estadisticas_f1);

        TextView btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(
                    EstadisticasF1Activity.this,
                    F1Activity.class
            );
            startActivity(intent);
            finish();
        });
    }
}