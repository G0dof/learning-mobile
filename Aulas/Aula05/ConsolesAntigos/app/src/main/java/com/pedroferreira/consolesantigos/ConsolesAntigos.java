package com.pedroferreira.consolesantigos;

public class ConsolesAntigos {
    private String nome;
    private int anoLancamento;
    private String publicadora;
    private String historia;

    public ConsolesAntigos(String nome, int anoLancamento, String publicadora, String historia) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.publicadora = publicadora;
        this.historia = historia;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getPublicadora() {
        return publicadora;
    }

    public String getHistoria() {
        return historia;
    }


}
