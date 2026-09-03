package br.com.cofreforte.modelo;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private Cliente titular;

    public ContaBancaria(String numeroConta, double saldo, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
        Agencia.registrarNovaConta();
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(this.saldo >= valor + Agencia.TAXA_SAQUE){
            this.saldo -= valor + Agencia.TAXA_SAQUE;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}
