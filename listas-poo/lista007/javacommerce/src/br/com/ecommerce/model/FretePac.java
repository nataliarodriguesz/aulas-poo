package br.com.ecommerce.model;

public class FretePac implements EstrategiaFrete{

    @Override
    public double calcular(double valorPedido) {
        double valor =  valorPedido * 1.05;
        return valor;
    }
}
