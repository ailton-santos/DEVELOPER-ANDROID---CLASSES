package com.example.consultacep;

public class CEP {
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

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

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    @Override
    public String toString () {
        return
                "Logradouro: " + getLogradouro()
                + "\nBairro: " + getBairro()
                + "\nCidade: " + getLocalidade()
                + "\nEstado: " + getUf();
    }
}
