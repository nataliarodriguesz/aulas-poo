package br.com.fintech.main;

import br.com.fintech.exceptions.LimiteTransacoesExcedidoException;
import br.com.fintech.model.CarteiraDigital;
import br.com.fintech.model.GatewayPagamentos;
import br.com.fintech.model.Transacao;

import java.util.HashSet;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // P01
        Transacao t1 = new Transacao("TX-101-BR", "PIX", 500.00, 2.50);
        Transacao t2 = new Transacao("TX-102-BR", "CARTÃO", 120.00, 36.00);
        Transacao t3 = new Transacao("TX-103-BR", "PIX", 350.00, 1.75);
        Transacao t4 = new Transacao("TX-104-BR", "BOLETO", 800.00, 4.50);

        System.out.println(t1);
        System.out.println(t4);

        // P02
        CarteiraDigital carteira = new CarteiraDigital("WALLET-CORP-01", 3);
        GatewayPagamentos gateway = new GatewayPagamentos();

        gateway.cadastrarCarteira(carteira);

        // P03
        try {
            carteira.adicionarTransacao(t1);
            System.out.println(t1.getIdTransacao() + " adicionado com sucesso");
            carteira.adicionarTransacao(t2);
            System.out.println(t2.getIdTransacao() + " adicionado com sucesso");
            carteira.adicionarTransacao(t3);
            System.out.println(t3.getIdTransacao() + " adicionado com sucesso");
        } catch (LimiteTransacoesExcedidoException e) {
            System.out.println(e.getMessage());
        }

        // P04
        try {
            carteira.adicionarTransacao(t4);
            System.out.println(t4 + " adicionado com sucesso");
        } catch (LimiteTransacoesExcedidoException e) {
            System.out.println(e.getMessage());
        }

        // P05
        Optional<CarteiraDigital> c = gateway.buscarCarteira("WALLET-CORP-01");
        if (c.isPresent()) {
            System.out.println(c.get().getCodigoCarteira());
        }

        // P06
        System.out.println("Tarifa total da carteria: R$" + carteira.calcularTarifaTotal());

        // P07
        System.out.println("Transações PIX: " + carteira.contaPorTipo("PIX"));

        // P08
        HashSet<Transacao> transacoes = new HashSet<>();
        transacoes.add(t1);

        Transacao t1_clone = new Transacao("TX-101-BR", "PIX", 900.00, 4.50);
        transacoes.add(t1_clone);

        transacoes.add(t2);
        System.out.println("Transações do Set: " + transacoes.size());

        // P09
        try {
            Transacao t5 = new Transacao("", "PIX", 100.00, 1.00);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
