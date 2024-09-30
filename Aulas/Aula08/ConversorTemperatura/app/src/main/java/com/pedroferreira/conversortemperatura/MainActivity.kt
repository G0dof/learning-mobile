package com.pedroferreira.conversortemperatura

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campoTemperatura: EditText = findViewById(R.id.editTextTemperatura)
        val botaoParaCelsius: Button = findViewById(R.id.buttonConverterParaCelsius)
        val botaoParaFahrenheit: Button = findViewById(R.id.buttonConverterParaFahrenheit)
        val textoResultado: TextView = findViewById(R.id.textViewResultado)

        botaoParaCelsius.setOnClickListener {
            val temperaturaTexto = campoTemperatura.text.toString()

            if (temperaturaTexto.isNotEmpty()) {
                val temperaturaFahrenheit = temperaturaTexto.toDouble()
                val temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9

                textoResultado.text = "Temperatura : %.2f ºC".format(temperaturaCelsius)
            } else {
                Toast.makeText(this, "Por favor, insira uma temperatura", Toast.LENGTH_SHORT).show()
            }
        }
        botaoParaFahrenheit.setOnClickListener {
            val temperaturaTexto = campoTemperatura.text.toString()

            if (temperaturaTexto.isNotEmpty()) {
                val temperaturaCelsius = temperaturaTexto.toDouble()
                val temperaturaFahrenheit = (temperaturaCelsius * 9) / 5 + 32

                textoResultado.text = "Temperatura : %.2f ºF".format(temperaturaFahrenheit)
            } else {
                Toast.makeText(this, "Por favor, insira uma temperatura", Toast.LENGTH_SHORT).show()
            }
        }

    }
}