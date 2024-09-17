package com.pedroferreira.jokenpo;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ringueIAPapel, ringueIAPedra, ringueIATesoura;
    private ImageView ringueJogadorPapel, ringueJogadorPedra, ringueJogadorTesoura;
    private ImageView circuloAzul, circuloVermelho;
    private TextView vitoriaJogador01, vitoriaJogador02, vitoriaJogador03;
    private TextView vitoriaIA01, vitoriaIA02, vitoriaIA03;
    private TextView nomeJogador, nomeIA, versus;
    private ImageView vencedor, perdedor;
    private int jogadorVenceu = 0;
    private int iaVenceu = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ringueIAPapel = findViewById(R.id.ringueIAPapel);
        ringueIAPedra = findViewById(R.id.ringueIAPedra);
        ringueIATesoura = findViewById(R.id.ringueIATesoura);

        ringueJogadorPapel = findViewById(R.id.ringueJogadorPapel);
        ringueJogadorPedra = findViewById(R.id.ringueJogadorPedra);
        ringueJogadorTesoura = findViewById(R.id.ringueJogadorTesoura);

        vitoriaJogador01 = findViewById(R.id.vitoriaJogador01);
        vitoriaJogador02 = findViewById(R.id.vitoriaJogador02);
        vitoriaJogador03 = findViewById(R.id.vitoriaJogador03);
        nomeJogador = findViewById(R.id.nomeJogador);

        vitoriaIA01 = findViewById(R.id.vitoriaIA01);
        vitoriaIA02 = findViewById(R.id.vitoriaIA02);
        vitoriaIA03 = findViewById(R.id.vitoriaIA03);
        nomeIA = findViewById(R.id.nomeIA);

        versus = findViewById(R.id.versus);

        circuloAzul = findViewById(R.id.circuloAzul);
        circuloVermelho = findViewById(R.id.circuloVermelho);

        vencedor = findViewById(R.id.vencedor);
        perdedor = findViewById(R.id.perdedor);

        findViewById(R.id.escolhaJogadorPapel).setOnClickListener(view -> jogar(0));
        findViewById(R.id.escolhaJogadorPedra).setOnClickListener(view -> jogar(1));
        findViewById(R.id.escolhaJogadorTesoura).setOnClickListener(view -> jogar(2));

    }

    public void jogar(int escolhaJogador) {
        resetarVisibilidade();

        int escolhaIA = new Random().nextInt(3);
        mostrarEscolhaIA(escolhaIA);
        mostrarEscolhaJogador(escolhaJogador);

        if (escolhaJogador == escolhaIA) {
        } else if (
                (escolhaJogador == 0 && escolhaIA == 1) ||
                        (escolhaJogador == 1 && escolhaIA == 2) ||
                        (escolhaJogador == 2 && escolhaIA == 1)) {
            jogadorVenceu++;
            contabilizarVitoriaJogador();
        } else {
            iaVenceu++;
            contabilizarVitoriaIA();
        }

        verificarVencedor();
    }

    public void mostrarEscolhaIA(int escolha) {
        switch (escolha) {
            case 0:
                ringueIAPapel.setVisibility(View.VISIBLE);
                break;
            case 1:
                ringueIAPedra.setVisibility(View.VISIBLE);
                break;
            case 2:
                ringueIATesoura.setVisibility(View.VISIBLE);
        }
    }

    public void mostrarEscolhaJogador(int escolha) {
        switch (escolha) {
            case 0:
                ringueJogadorPapel.setVisibility(View.VISIBLE);
                break;
            case 1:
                ringueJogadorPedra.setVisibility(View.VISIBLE);
                break;
            case 2:
                ringueJogadorTesoura.setVisibility(View.VISIBLE);
        }
    }

    public void verificarVencedor() {
        if (jogadorVenceu == 3) {
            esconderPlacarERingue();
            vencedor.setVisibility(View.VISIBLE);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    resetarJogo();
                }

            }, 3000);
        } else if (iaVenceu == 3) {
            esconderPlacarERingue();
            perdedor.setVisibility(View.VISIBLE);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    resetarJogo();
                }

            }, 3000);
        }
    }

    private void esconderPlacarERingue() {
        vitoriaJogador01.setVisibility(View.INVISIBLE);
        vitoriaJogador02.setVisibility(View.INVISIBLE);
        vitoriaJogador03.setVisibility(View.INVISIBLE);
        nomeJogador.setVisibility(View.INVISIBLE);

        vitoriaIA01.setVisibility(View.INVISIBLE);
        vitoriaIA02.setVisibility(View.INVISIBLE);
        vitoriaIA03.setVisibility(View.INVISIBLE);
        nomeIA.setVisibility(View.INVISIBLE);

        ringueIAPapel.setVisibility(View.INVISIBLE);
        ringueIAPedra.setVisibility(View.INVISIBLE);
        ringueIATesoura.setVisibility(View.INVISIBLE);
        ringueJogadorPapel.setVisibility(View.INVISIBLE);
        ringueJogadorPedra.setVisibility(View.INVISIBLE);
        ringueJogadorTesoura.setVisibility(View.INVISIBLE);
        circuloAzul.setVisibility(View.INVISIBLE);
        circuloVermelho.setVisibility(View.INVISIBLE);
        versus.setVisibility(View.INVISIBLE);
    }

    private void resetarJogo() {
        jogadorVenceu = 0;
        iaVenceu = 0;

        vitoriaJogador01.setVisibility(View.INVISIBLE);
        vitoriaJogador02.setVisibility(View.INVISIBLE);
        vitoriaJogador03.setVisibility(View.INVISIBLE);
        nomeJogador.setVisibility(View.VISIBLE);

        vitoriaIA01.setVisibility(View.INVISIBLE);
        vitoriaIA02.setVisibility(View.INVISIBLE);
        vitoriaIA03.setVisibility(View.INVISIBLE);
        nomeIA.setVisibility(View.VISIBLE);

        circuloAzul.setVisibility(View.VISIBLE);
        circuloVermelho.setVisibility(View.VISIBLE);
        versus.setVisibility(View.VISIBLE);

        vencedor.setVisibility(View.INVISIBLE);
        perdedor.setVisibility(View.INVISIBLE);
    }

    public void resetarVisibilidade() {
        ringueJogadorPapel.setVisibility(View.INVISIBLE);
        ringueJogadorPedra.setVisibility(View.INVISIBLE);
        ringueJogadorTesoura.setVisibility(View.INVISIBLE);
        ringueIAPapel.setVisibility(View.INVISIBLE);
        ringueIAPedra.setVisibility(View.INVISIBLE);
        ringueIATesoura.setVisibility(View.INVISIBLE);
        vencedor.setVisibility(View.INVISIBLE);
        perdedor.setVisibility(View.INVISIBLE);
    }

    public void contabilizarVitoriaJogador() {
        if (jogadorVenceu == 1) vitoriaJogador01.setVisibility(View.VISIBLE);
        else if (jogadorVenceu == 2) vitoriaJogador02.setVisibility(View.VISIBLE);
        else if (jogadorVenceu == 3) vitoriaJogador03.setVisibility(View.VISIBLE);
    }

    public void contabilizarVitoriaIA() {
        if (iaVenceu == 1) vitoriaIA01.setVisibility(View.VISIBLE);
        else if (iaVenceu == 2) vitoriaIA02.setVisibility(View.VISIBLE);
        else if (iaVenceu == 3) vitoriaIA03.setVisibility(View.VISIBLE);
    }
}