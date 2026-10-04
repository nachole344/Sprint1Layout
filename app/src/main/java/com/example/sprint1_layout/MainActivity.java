package com.example.sprint1_layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cargamos la pantalla inicial
        setContentView(R.layout.activity_main);

        // Buscamos los elementos de la pantalla
        ImageView imgLogo = findViewById(R.id.imgLogo);
        TextView txtBienvenida = findViewById(R.id.txtBienvenida);
        TextView txtSubtitulo = findViewById(R.id.txtSubtitulo);
        Button btnContinuar = findViewById(R.id.btnContinuar);

        // Cargamos las animaciones
        Animation fadeIn = AnimationUtils.loadAnimation(
                this,
                R.anim.fade_in
        );

        Animation slideUp = AnimationUtils.loadAnimation(
                this,
                R.anim.slide_up
        );

        Animation scaleIn = AnimationUtils.loadAnimation(
                this,
                R.anim.scale_in
        );

        // El ishowspeed_logo aparece primero
        imgLogo.startAnimation(fadeIn);

        // El titulo aparece subiendo
        txtBienvenida.startAnimation(slideUp);

        // El subtitulo aparece subiendo
        txtSubtitulo.startAnimation(slideUp);

        // El boton aparece con escala
        btnContinuar.startAnimation(scaleIn);

        // Cuando pulsamos ENTRAR...
        btnContinuar.setOnClickListener(v -> {

            // Abrimos la pantalla de seleccion
            Intent intent = new Intent(
                    MainActivity.this,
                    DeportesActivity.class
            );

            startActivity(intent);
        });
    }
}