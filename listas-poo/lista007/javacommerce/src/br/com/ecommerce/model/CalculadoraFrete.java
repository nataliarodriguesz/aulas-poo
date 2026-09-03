package br.com.ecommerce.model;

import br.com.ecommerce.exception.TipoFreteInvalidoException;

public class CalculadoraFrete {
    public void processarFrete(double valorPedido, EstrategiaFrete estrategiaFrete) {
        if (estrategiaFrete == null) {
            throw new TipoFreteInvalidoException();
        }

        System.out.println(estrategiaFrete.calcular(valorPedido));
    }
}
