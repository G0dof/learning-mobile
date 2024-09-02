package com.example.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        Button buttonSortear = findViewById(R.id.buttonSortear);
        TextView textViewModelo = findViewById(R.id.textViewModelo);
        Modelos modelos = new Modelos();

        buttonSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] modelosDeCarros = modelos.getModelosDeCarros();

                int aleatorio = new Random().nextInt(modelosDeCarros.length);

                textViewModelo.setText(modelosDeCarros[aleatorio]);
            }
        });
    }
}