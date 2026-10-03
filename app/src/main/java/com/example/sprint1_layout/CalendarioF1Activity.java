package com.example.sprint1_layout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CalendarioF1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cargamos el diseño de la pantalla del calendario
        setContentView(R.layout.activity_calendario_f1);
    }
}