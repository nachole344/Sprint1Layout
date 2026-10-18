package com.example.sprint1_layout;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MotoGPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.motogp_home);

        // Boton de inicio (nav)
        findViewById(R.id.nav_home).setOnClickListener(v ->
                startActivity(new Intent(this, MotoGPActivity.class)));

        // Boton de pilotos (pantalla principal)
        findViewById(R.id.menuPilotos).setOnClickListener(v ->
                startActivity(new Intent(this, PilotosMotoGPActivity.class)));

        // Boton de pilotos (nav)
        findViewById(R.id.nav_pilotos).setOnClickListener(v ->
                startActivity(new Intent(this, PilotosMotoGPActivity.class)));

        // Boton de clasificación
        findViewById(R.id.menuClasificacion).setOnClickListener(v ->
                startActivity(new Intent(this, ClasificacionMotoGPActivity.class)));

        // Boton de clasificación (nav)
        findViewById(R.id.nav_clasificacion).setOnClickListener(v ->
                startActivity(new Intent(this, ClasificacionMotoGPActivity.class)));

        // Boton de calendario
        findViewById(R.id.homeCalendario).setOnClickListener(v ->
                startActivity(new Intent(this, CalendarioMotoGPActivity.class)));

        // Boton de F1
        findViewById(R.id.nav_f1).setOnClickListener(v ->
                startActivity(new Intent(this, F1Activity.class)));


    }
}
