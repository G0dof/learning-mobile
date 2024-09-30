package com.pedroferreira.calculadoraimc

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textoPeso: EditText = findViewById(R.id.editTextPeso)
        val textoAltura: EditText = findViewById(R.id.editTextAltura)
        val botaoCalcular: Button = findViewById(R.id.buttonCalcular)
        val textoResultado: TextView = findViewById(R.id.editTextResultado)

        botaoCalcular.setOnClickListener {
            val campoPeso = textoPeso.text.toString()
            val campoAltura = textoAltura.text.toString()

            if (campoPeso.isNotEmpty() && campoAltura.isNotEmpty()) {
                val peso = campoPeso.toDouble()
                val altura = campoAltura.toDouble()
                val imc = peso / (altura.pow(2.0))

                if (imc >= 40.0) {
                    textoResultado.text = "Obesidade Grau III"
                } else if (imc in 35.0..39.9) {
                    textoResultado.text = "Obesidade Grau II"
                } else if (imc in 30.0..34.9) {
                    textoResultado.text = "Obesidade Grau I"
                } else if (imc in 25.0..29.9) {
                    textoResultado.text = "Sobrepeso"
                } else if (imc in 18.5..24.9) {
                    textoResultado.text = "Peso Normal"
                } else {
                    textoResultado.text = "Abaixo do Peso"
                }
            } else {
                Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_LONG).show()
            }
        }
    }
}