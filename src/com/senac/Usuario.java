package com.senac;

public class Usuario {

    private String nome;
    private int idade;
    private boolean casado;
    private double salario;

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome + " é um vacilão";
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;

    }

    public double isSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
