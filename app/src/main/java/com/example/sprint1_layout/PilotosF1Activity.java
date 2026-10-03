package com.example.sprint1_layout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PilotosF1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cargamos el diseño de la pantalla de pilotos
        setContentView(R.layout.activity_pilotos_f1);
    }
}