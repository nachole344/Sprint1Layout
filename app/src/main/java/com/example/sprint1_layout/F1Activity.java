package com.example.sprint1_layout;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class F1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.f1_home);

        findViewById(R.id.menuPilotos).setOnClickListener(v -> {
            Intent intent = new Intent(F1Activity.this, PilotosF1Activity.class);
            startActivity(intent);
        });

        findViewById(R.id.menuClasificacion).setOnClickListener(v -> {
            Intent intent = new Intent(F1Activity.this, ClasificacionF1Activity.class);
            startActivity(intent);
        });

        findViewById(R.id.menuEstadisticas).setOnClickListener(v -> {
            Intent intent = new Intent(F1Activity.this, EstadisticasF1Activity.class);
            startActivity(intent);
        });
    }
}