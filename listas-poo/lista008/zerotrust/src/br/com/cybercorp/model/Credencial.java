package br.com.cybercorp.model;

import java.util.Objects;

public class Credencial {
    private String codigoHex;
    private boolean ativo;
    private Funcionario titular;

    public Credencial(String codigoHex, boolean ativo, Funcionario titular) {
        this.codigoHex = codigoHex;
        this.titular = titular;
        this.ativo = ativo;
    }

    public String getCodigoHex() {
        return codigoHex;
    }

    public void setCodigoHex(String codigoHex) {
        this.codigoHex = codigoHex;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Funcionario getTitular() {
        return titular;
    }

    public void setTitular(Funcionario titular) {
        this.titular = titular;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Credencial that = (Credencial) o;
        return Objects.equals(codigoHex, that.codigoHex);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoHex);
    }

    @Override
    public String toString() {
        return "Credencial [ " +
                "CodigoHex: " + codigoHex +
                ", Ativo: " + ativo +
                ", Titular: " + titular +
                " ]";
    }
}