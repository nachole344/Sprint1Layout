package com.example.sprint1_layout;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class PilotosMotoGPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se carga el Layout de la lista de pilotos (MotoGP)
        setContentView(R.layout.activity_pilotos_motogp);

        // Boton de volver
        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
    }
}
