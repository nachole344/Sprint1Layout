package com.example.sprint1_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class DeportesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Cargamos la pantalla para elegir deporte
        setContentView(R.layout.activity_deportes);
        FrameLayout cardF1 = findViewById(R.id.cardF1);
        FrameLayout cardMotoGP = findViewById(R.id.cardMotoGP);

        cardF1.setAlpha(0f);
        cardMotoGP.setAlpha(0f);

        cardF1.setTranslationY(80f);
        cardMotoGP.setTranslationY(80f);

        cardF1.animate()
                .alpha(1f)
                .translationY(0f)
                .setDuration(500)
                .start();

        cardMotoGP.animate()
                .alpha(1f)
                .translationY(0f)
                .setStartDelay(150)
                .setDuration(500)
                .start();

        cardF1.setOnClickListener(v -> {

            v.animate()
                    .scaleX(0.96f)
                    .scaleY(0.96f)
                    .setDuration(100)
                    .withEndAction(() -> {

                        v.animate()
                                .scaleX(1f)
                                .scaleY(1f)
                                .setDuration(100)
                                .start();

                        Intent intent = new Intent(DeportesActivity.this, F1Activity.class);
                        startActivity(intent);

                    })
                    .start();

        });
        cardMotoGP.setOnClickListener(v -> {

            v.animate()
                    .scaleX(0.96f)
                    .scaleY(0.96f)
                    .setDuration(100)
                    .withEndAction(() -> {

                        v.animate()
                                .scaleX(1f)
                                .scaleY(1f)
                                .setDuration(100)
                                .start();

                        Intent intent = new Intent(DeportesActivity.this, MotoGPActivity.class);
                        startActivity(intent);

                    })
                    .start();

        });


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