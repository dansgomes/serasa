package com.serasa.domain;

public class Pessoa {

    private String nome;

    private String cpf;

    private String rg;

    private String telefone;

    public Pessoa(){}
    public Pessoa(String cpf){
        this.cpf = cpf;
    }

    public Pessoa(String telefone) {this.telefone = telefone;}

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
