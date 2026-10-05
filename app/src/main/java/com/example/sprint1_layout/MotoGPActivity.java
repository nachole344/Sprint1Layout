package com.example.sprint1_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MotoGPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.motogp_home);

        // Tarjeta de PILOTOS
        FrameLayout cardPilotosMGP = findViewById(R.id.cardPilotosMGP);
        cardPilotosMGP.setOnClickListener(v -> {
            Intent intent = new Intent(MotoGPActivity.this, PilotosMotoGPActivity.class);
            startActivity(intent);
        });

        // Tarjeta de CLASIFICACIÓN
        FrameLayout cardClasificacion = findViewById(R.id.cardClasificacion);
        cardClasificacion.setOnClickListener(v -> {
            Intent intent = new Intent(MotoGPActivity.this, ClasificacionMotoGPActivity.class);
            startActivity(intent);
        });

        // Tarjeta de CALENDARIO
        FrameLayout cardCalendario = findViewById(R.id.cardCalendario);
        cardCalendario.setOnClickListener(v -> {
            Intent intent = new Intent(MotoGPActivity.this, CalendarioMotoGPActivity.class);
            startActivity(intent);
        });
    }
}