package com.company.model;

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cidade;
    private int numero;
    private String complemento;

    public Endereco(String logradouro, String bairro, String cidade, int numero, String complemento) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}