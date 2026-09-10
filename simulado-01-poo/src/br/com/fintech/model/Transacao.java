package br.com.fintech.model;

import java.util.Objects;

public class Transacao {
    private String idTransacao;
    private String tipo;
    private double valor;
    private double tarifa;

    public Transacao(String idTransacao, String tipo, double valor, double tarifa) {
        if(idTransacao == null || idTransacao.trim().isEmpty()){
            throw new IllegalArgumentException("ID de transação não pode ser nulo ou vazio");
        }

        this.idTransacao = idTransacao;
        this.tipo = tipo;
        this.valor = valor;
        this.tarifa = tarifa;
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return Objects.equals(idTransacao, transacao.idTransacao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idTransacao);
    }

    @Override
    public String toString() {
        return "Transacao[" +
                "id=" + idTransacao +
                ", tipo='" + tipo +
                ", valor=R$" + valor +
                ", tarifa=R$" + tarifa +
                ']';
    }
}
