package com.pedro.geradordesenha

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val letraMin = "abcdefghijklmnopqrstuvwxyz"
        val numero = "0123456789"
        val caracter = "!@#$%&"

        val botaoResultado: Button = findViewById(R.id.botaoResultado)
        val gerarSenha: TextView = findViewById(R.id.textViewSenha)

        botaoResultado.setOnClickListener {
            val senha = StringBuilder()

            for (i in 0 until 3) {
                val letra = letraMin.random()
                val num = numero.random()
                val simbolo = caracter.random()
                senha.append(letra)
                senha.append(num)
                senha.append(simbolo)
            }

            gerarSenha.text = senha.toString()
        }
    }
}