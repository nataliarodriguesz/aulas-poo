package br.com.ecommerce.model;

public class FreteMotoboy implements EstrategiaFrete {

    @Override
    public double calcular(double valorPedido) {
        double valor =  valorPedido + 15;
        return valor;
    }
}
