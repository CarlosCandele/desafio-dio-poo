package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescriocao() {
        return descriocao;
    }

    public void setDescriocao(String descriocao) {
        this.descriocao = descriocao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    private String descriocao;
    private LocalDate data;
}
