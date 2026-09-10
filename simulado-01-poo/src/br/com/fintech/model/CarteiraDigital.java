package br.com.fintech.model;

import br.com.fintech.exceptions.LimiteTransacoesExcedidoException;

import java.util.ArrayList;
import java.util.List;

public class CarteiraDigital {
    private String codigoCarteira;
    private int capacidadeMaximaTransacoes;
    List<Transacao> transacoes;

    public CarteiraDigital(String codigoCarteira, int capacidadeMaximaTransacoes) {
        this.codigoCarteira = codigoCarteira;
        this.capacidadeMaximaTransacoes = capacidadeMaximaTransacoes;
        this.transacoes = new ArrayList<>();
        System.out.println("Carteira " + codigoCarteira + " cadastrada com limite de " + capacidadeMaximaTransacoes + " transações");
    }

    public String getCodigoCarteira() {
        return codigoCarteira;
    }

    public int getCapacidadeMaximaTransacoes() {
        return capacidadeMaximaTransacoes;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(Transacao transacao) throws LimiteTransacoesExcedidoException {
        if (this.transacoes.size() >= this.capacidadeMaximaTransacoes){
            throw new LimiteTransacoesExcedidoException("Exceção capturada: Carteira '" + getCodigoCarteira() + "' atingiu a capacidade maxima de " +
                      getCapacidadeMaximaTransacoes() + " pacotes");
        }
        transacoes.add(transacao);
    }

    public double calcularTarifaTotal(){
        return transacoes.stream().mapToDouble(Transacao::getTarifa).sum();
    }

    public long contaPorTipo(String tipo){
        return transacoes.stream().filter(transacao -> transacao.getTipo().equals(tipo)).count();
    }
}
