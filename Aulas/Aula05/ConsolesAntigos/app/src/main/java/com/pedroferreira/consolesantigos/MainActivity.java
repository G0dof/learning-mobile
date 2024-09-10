package com.pedroferreira.consolesantigos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxAtari;
    private CheckBox checkBoxNES;
    private CheckBox checkBoxMasterSystem;
    private CheckBox checkBoxMegaDrive;
    private CheckBox checkBoxGameBoy;
    private CheckBox checkBoxSNES;
    private CheckBox checkBoxNintendo64;

    private Button buttonPublicadora;
    private Button buttonHistoria;
    private Button buttonLancamento;

    private TextView textViewSaida;

    private Switch switchIdioma;
    private Boolean ingles = false;

    private ConsolesAntigos[] consolesPTBR;
    private ConsolesAntigos[] consolesENG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        consolesPTBR = new ConsolesAntigos[]{
                new ConsolesAntigos("Atari 2600", 1977, "Atari", "O Atari 2600 popularizou os jogos eletrônicos nos anos 80."),
                new ConsolesAntigos("NES", 1983, "Nintendo", "O Nintendo Entertainment System revolucionou a indústria dos games."),
                new ConsolesAntigos("Master System", 1985, "Sega", "O Master System foi o principal concorrente do NES."),
                new ConsolesAntigos("Mega Drive", 1988, "Sega", "Conhecido como Genesis nos EUA, foi um sucesso na década de 90."),
                new ConsolesAntigos("Nintendo Game Boy", 1989, "Nintendo", "O Game Boy popularizou os jogos portáteis."),
                new ConsolesAntigos("SNES", 1990, "Nintendo", "O Super Nintendo Entertainment System foi um dos consoles mais amados."),
                new ConsolesAntigos("Nintendo 64", 1996, "Nintendo", "O Nintendo 64 foi o último grande console a usar cartuchos."),
                new ConsolesAntigos("PSX", 1994, "Sony", "O PlayStation original trouxe os CDs para os jogos de console."),
                new ConsolesAntigos("Sega Dreamcast", 1999, "Sega", "O Dreamcast foi o primeiro console a incluir um modem para jogos online."),
                new ConsolesAntigos("NEO Geo", 1990, "SNK", "O Neo Geo era conhecido por seus jogos de arcade e preço elevado."),
                new ConsolesAntigos("PS2", 2000, "Sony", "O PlayStation 2 é o console mais vendido de todos os tempos."),
                new ConsolesAntigos("XBOX", 2001, "Microsoft", "O Xbox foi o primeiro console da Microsoft, introduzindo o Xbox Live."),
                new ConsolesAntigos("PS3", 2006, "Sony", "O PlayStation 3 trouxe o Blu-ray para os jogos de console."),
                new ConsolesAntigos("Nintendo Wii", 2006, "Nintendo", "O Wii popularizou os controles por movimento e foi um enorme sucesso.")
        };
        consolesENG = new ConsolesAntigos[]{
                new ConsolesAntigos("Atari 2600", 1977, "Atari", "The Atari 2600 popularized video games in the 80s."),
                new ConsolesAntigos("NES", 1983, "Nintendo", "The Nintendo Entertainment System revolutionized the gaming industry."),
                new ConsolesAntigos("Master System", 1985, "Sega", "The Master System was the main competitor to the NES."),
                new ConsolesAntigos("Mega Drive", 1988, "Sega", "Known as Genesis in the US, it was a hit in the 90s."),
                new ConsolesAntigos("Nintendo Game Boy", 1989, "Nintendo", "The Game Boy made handheld gaming popular."),
                new ConsolesAntigos("SNES", 1990, "Nintendo", "The Super Nintendo Entertainment System was one of the most beloved consoles."),
                new ConsolesAntigos("Nintendo 64", 1996, "Nintendo", "The Nintendo 64 was the last major console to use cartridges."),
                new ConsolesAntigos("PSX", 1994, "Sony", "The original PlayStation brought CDs to console gaming."),
                new ConsolesAntigos("Sega Dreamcast", 1999, "Sega", "The Dreamcast was the first console to include a modem for online play."),
                new ConsolesAntigos("NEO Geo", 1990, "SNK", "The Neo Geo was known for its arcade games and high price."),
                new ConsolesAntigos("PS2", 2000, "Sony", "The PlayStation 2 is the best-selling console of all time."),
                new ConsolesAntigos("XBOX", 2001, "Microsoft", "The Xbox was Microsoft's first console, introducing Xbox Live."),
                new ConsolesAntigos("PS3", 2006, "Sony", "The PlayStation 3 brought Blu-ray to console gaming."),
                new ConsolesAntigos("Nintendo Wii", 2006, "Nintendo", "The Wii popularized motion controls and was a huge success.")
        };

        checkBoxAtari = findViewById(R.id.checkBoxAtari);
        checkBoxNES = findViewById(R.id.checkBoxNES);
        checkBoxMasterSystem = findViewById(R.id.checkBoxMasterSystem);
        checkBoxMegaDrive = findViewById(R.id.checkBoxMegaDrive);
        checkBoxSNES = findViewById(R.id.checkBoxSNES);
        checkBoxGameBoy = findViewById(R.id.checkBoxGameBoy);
        checkBoxNintendo64 = findViewById(R.id.checkBoxNintendo64);

        buttonPublicadora = findViewById(R.id.buttonPublicadora);
        buttonHistoria = findViewById(R.id.buttonHistoria);
        buttonLancamento = findViewById(R.id.buttonLancamento);

        switchIdioma = findViewById(R.id.switchIdioma);

        textViewSaida = findViewById(R.id.textViewSaida);

        switchIdioma.setOnCheckedChangeListener(
                (buttonView, isChecked) -> {
                    ingles = isChecked;
                });

        buttonHistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConsolesAntigos consoleEscolhido = buscarConsoleSelecionado();
                if (consoleEscolhido != null) {
                    String historia = consoleEscolhido.getHistoria();
                    textViewSaida.setText(historia);
                } else {
                    textViewSaida.setText("Nenhum console selecionado");
                }
            }
        });

        buttonPublicadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConsolesAntigos consoleEscolhido = buscarConsoleSelecionado();
                if (consoleEscolhido != null) {
                    String publicadora = consoleEscolhido.getPublicadora();
                    textViewSaida.setText(publicadora);
                } else {
                    textViewSaida.setText("Nenhum console selecionado");
                }
            }
        });

        buttonLancamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConsolesAntigos consoleEscolhido = buscarConsoleSelecionado();
                if (consoleEscolhido != null) {
                    String lancamento = String.valueOf(consoleEscolhido.getAnoLancamento());
                    textViewSaida.setText(lancamento);
                } else {
                    textViewSaida.setText("Nenhum console selecionado");
                }
            }
        });
    }

    private ConsolesAntigos buscarConsoleSelecionado() {
        ConsolesAntigos[] consoleSelecionado = ingles ? consolesENG : consolesPTBR;

        if (checkBoxAtari.isChecked())
            return buscarConsolePorNome("Atari 2600", consoleSelecionado);
        if (checkBoxSNES.isChecked()) return buscarConsolePorNome("SNES", consoleSelecionado);
        return null;
    }

    private ConsolesAntigos buscarConsolePorNome(String nome, ConsolesAntigos[] consoleSelecionado) {
        for (ConsolesAntigos console : consoleSelecionado) {
            if (console.getNome().equalsIgnoreCase(nome)) return console;
        }

        return null;
    }
}