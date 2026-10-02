package com.example.ishowspeed;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class F1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cargamos el XML de la pantalla F1
        setContentView(R.layout.activity_f1);

        // Buscamos la tarjeta de PILOTOS
        LinearLayout cardPilotos = findViewById(R.id.cardPilotos);

        // Cuando pulsemos la tarjeta de pilotos...
        cardPilotos.setOnClickListener(v -> {

            // Abrimos la pantalla PilotosF1Activity
            Intent intent = new Intent(
                    F1Activity.this,
                    PilotosF1Activity.class
            );

            startActivity(intent);
        });

        // Buscamos la tarjeta de CLASIFICACION
        LinearLayout cardClasificacion = findViewById(R.id.cardClasificacion);

        // Cuando pulsemos la tarjeta...
        cardClasificacion.setOnClickListener(v -> {

            // Abrimos la pantalla de clasificacion
            Intent intent = new Intent(
                    F1Activity.this,
                    ClasificacionF1Activity.class
            );

            startActivity(intent);
        });

        // Buscamos la tarjeta de CALENDARIO
        LinearLayout cardCalendario = findViewById(R.id.cardCalendario);

        // Cuando pulsemos la tarjeta...
        cardCalendario.setOnClickListener(v -> {

            // Abrimos la pantalla del calendario
            Intent intent = new Intent(
                    F1Activity.this,
                    CalendarioF1Activity.class
            );

            startActivity(intent);
        });
    }
}