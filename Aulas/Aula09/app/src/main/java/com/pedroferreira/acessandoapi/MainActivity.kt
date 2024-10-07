package com.pedroferreira.acessandoapi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var editTextCep: EditText
    private lateinit var buttonBuscar: Button
    private lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextCep = findViewById(R.id.editTextCep)
        buttonBuscar = findViewById(R.id.buttonBuscar)
        textViewResultado = findViewById(R.id.textViewResultado)

        buttonBuscar.setOnClickListener {
            val cep = editTextCep.text.toString()

            if (cep.isNotEmpty()) buscarCep(cep)
            else Toast.makeText(this, "Por favor, digite um cep", Toast.LENGTH_SHORT).show()
        }

    }

    private fun buscarCep(cep: String) {
        val call = RetrofitClient.instance.buscarCep(cep)

        call.enqueue(object : Callback<CepResponse>{
            override fun onResponse(call: Call<CepResponse>, response: Response<CepResponse>) {
                if(response.isSuccessful) {
                    val cepResponse = response.body()

                    cepResponse?.let {
                        val resultado = """
                            CEP: ${it.cep}
                            Logradouro: ${it.logradouro}
                            Bairro: ${it.bairro}
                            Localidade: ${it.localidade}
                            UF: ${it.uf}
                        """.trimIndent()

                        textViewResultado.text = resultado
                    }
                } else
                    Toast.makeText(this@MainActivity, "CEP não encontrado", Toast.LENGTH_SHORT).show()

            }

            override fun onFailure(call: Call<CepResponse>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Erro ao buscar o CEP", Toast.LENGTH_SHORT).show()
            }
        })
    }
}