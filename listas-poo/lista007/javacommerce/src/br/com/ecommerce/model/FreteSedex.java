package br.com.ecommerce.model;

public class FreteSedex implements EstrategiaFrete{

    @Override
    public double calcular(double valorPedido) {
        double valor =  valorPedido * 1.1;
        return valor;
    }
}
