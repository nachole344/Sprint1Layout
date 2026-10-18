package com.example.sprint1_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class F1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cargamos el XML de la pantalla F1
        setContentView(R.layout.f1_home);

        //Se ha eliminado el funcionamiento de esta actividad para probar los cambios en MotoGP
    }
}