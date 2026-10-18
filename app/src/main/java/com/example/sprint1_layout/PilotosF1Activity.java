package com.example.sprint1_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PilotosF1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cargamos el diseño de la pantalla de pilotos
        setContentView(R.layout.activity_pilotos_f1);

        // boton para volver al inicio de f1
        TextView btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(
                    PilotosF1Activity.this,
                    F1Activity.class
            );
            startActivity(intent);
            finish();
        });
    }
}