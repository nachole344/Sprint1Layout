package com.example.sprint1_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class DeportesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cargamos la pantalla para elegir deporte
        setContentView(R.layout.activity_deportes);

        // Buscamos la tarjeta de F1
        LinearLayout cardF1 = findViewById(R.id.cardF1);

        // Cuando pulsemos F1...
        cardF1.setOnClickListener(v -> {

            // Abrimos la pantalla principal de F1
            Intent intent = new Intent(
                    DeportesActivity.this,
                    F1Activity.class
            );

            startActivity(intent);
        });
    }
}