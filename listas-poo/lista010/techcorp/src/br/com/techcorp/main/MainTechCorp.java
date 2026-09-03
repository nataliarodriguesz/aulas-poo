package br.com.techcorp.main;

import br.com.techcorp.model.ControleDeAcesso;
import br.com.techcorp.model.Funcionario;

public class MainTechCorp {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("T-001", "Alice");
        Funcionario f2 = new Funcionario("T-001", "Alice Duplicada");
        ControleDeAcesso controleDeAcesso = new ControleDeAcesso();

        controleDeAcesso.registraPassagem(f1);
        controleDeAcesso.registraPassagem(f2);

        controleDeAcesso.concederAcessoSala(f1);
        controleDeAcesso.concederAcessoSala(f2);
    }
}
