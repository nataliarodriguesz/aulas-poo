package br.com.techcorp.model;

import java.util.Objects;

public class Funcionario {
    private String matricula;
    private String nome;
    private String cargo;

    // Construtor
    public Funcionario(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    // equals() e hashcode()
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(matricula, that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    //toString
    @Override
    public String toString() {
        return "Funcionario \n" +
                "  Matricula:  '" + matricula + '\'' +
                "  Nome: " + nome + '\'' +
                "  Cargo: " + cargo + '\'';
    }
}
