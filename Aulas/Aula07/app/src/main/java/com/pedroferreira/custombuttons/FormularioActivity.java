package com.pedroferreira.custombuttons;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button buttonEnviarFormulario = findViewById(R.id.buttonEnviarFormulario);
        TextView editTextNomeFormulario = findViewById(R.id.editTextNomeFormulario);
        TextView editTextSenha = findViewById(R.id.editTextSenha);
        TextView editTextConfirmarSenha = findViewById(R.id.editTextConfirmarSenha);
        TextView editMensagem = findViewById(R.id.editMensagem);

        buttonEnviarFormulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextSenha.getText().toString().equals(editTextConfirmarSenha.getText().toString())) {
                    editMensagem.setText(editTextNomeFormulario.getText()+", suas senhas estão coincidindo!");
                } else {
                    editMensagem.setText(editTextNomeFormulario.getText()+ ", suas senhas NÃO estão coindidindo");
                }
            }
        });

    }
}