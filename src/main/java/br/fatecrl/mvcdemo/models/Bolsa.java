package br.fatecrl.mvcdemo.models;

public class Bolsa {
    private String modelo;
    private String tamanho;
    private float valor;

    public Bolsa(String modelo, String tamanho, float valor) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
