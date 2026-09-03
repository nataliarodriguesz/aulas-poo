package br.com.techcorp.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControleDeAcesso {
    private List<Funcionario> historicoCatraca;
    private Set<Funcionario> autorizadoSalaSegura;

    // Construtor
    public ControleDeAcesso() {
        this.historicoCatraca = new ArrayList<Funcionario>();
        this.autorizadoSalaSegura = new HashSet<Funcionario>();
    }

    public void registraPassagem(Funcionario f) {
        historicoCatraca.add(f);
        System.out.println("Passagem registrado com sucesso");
    }

    public void concederAcessoSala(Funcionario f) {
        if (autorizadoSalaSegura.add(f)) {
            System.out.println("Acesso liberado para a Sala Segura");
        } else {
            System.out.println("Aviso: Matrícula já registrada na sala. Acesso não permitido");
        }
    }
}
