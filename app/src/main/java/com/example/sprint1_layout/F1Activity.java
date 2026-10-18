package com.example.sprint1_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class F1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.f1_home);

        // =====================================
        // ACCESOS DE EXPLORA F1
        // =====================================

        findViewById(R.id.menuPilotos).setOnClickListener(v -> {
            Intent intent = new Intent(
                    F1Activity.this,
                    PilotosF1Activity.class
            );
            startActivity(intent);
        });

        findViewById(R.id.menuClasificacion).setOnClickListener(v -> {
            Intent intent = new Intent(
                    F1Activity.this,
                    ClasificacionF1Activity.class
            );
            startActivity(intent);
        });

        findViewById(R.id.menuEstadisticas).setOnClickListener(v -> {
            Intent intent = new Intent(
                    F1Activity.this,
                    EstadisticasF1Activity.class
            );
            startActivity(intent);
        });

        // =====================================
        // BARRA DE NAVEGACION INFERIOR
        // =====================================

        ImageButton navHome = findViewById(R.id.nav_home);
        ImageButton navPilotos = findViewById(R.id.nav_pilotos);
        ImageButton navAdd = findViewById(R.id.nav_add);
        ImageButton navClasificacion = findViewById(R.id.nav_clasificacion);
        ImageButton navMotoGP = findViewById(R.id.nav_motogp);

        // INICIO: ya estamos en la pantalla principal
        navHome.setOnClickListener(v -> {
            // No hacemos nada porque ya estamos en F1Activity
        });

        // PILOTOS
        navPilotos.setOnClickListener(v -> {
            Intent intent = new Intent(
                    F1Activity.this,
                    PilotosF1Activity.class
            );
            startActivity(intent);
        });

        // BOTON CENTRAL +
        navAdd.setOnClickListener(v -> {
            // De momento no tiene ninguna accion
        });

        // CLASIFICACION
        navClasificacion.setOnClickListener(v -> {
            Intent intent = new Intent(
                    F1Activity.this,
                    ClasificacionF1Activity.class
            );
            startActivity(intent);
        });

        // MOTOGP
        navMotoGP.setOnClickListener(v -> {
            Intent intent = new Intent(
                    F1Activity.this,
                    MotoGPActivity.class
            );
            startActivity(intent);
        });
    }
}
