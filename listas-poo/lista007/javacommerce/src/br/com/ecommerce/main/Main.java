package br.com.ecommerce.main;

import br.com.ecommerce.exception.TipoFreteInvalidoException;
import br.com.ecommerce.model.*;

public class Main {
    public static void main(String[] args) {
        // 1. Instancie a sua nova CalculadoraFrete.
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();

        // 2. Crie um bloco try-catch.
        try{
            // 3. Dentro do try, faça 3 testes calculando fretes válidos para um pedido de R$ 100.00
            // (Injete o new FreteSedex(), new FretePac(), etc, como parâmetro). Imprima os resultados.

            calculadoraFrete.processarFrete(100.00, new FreteSedex());
            calculadoraFrete.processarFrete(100.00, new FretePac());
            calculadoraFrete.processarFrete(100.00, new FreteMotoboy());

            // 4. Ainda no try, force um erro: chame o processarFrete passando null no lugar da estratégia.
            calculadoraFrete.processarFrete(100.00, null);
        }catch(TipoFreteInvalidoException e){
            // 5. No bloco catch, capture a sua TipoFreteInvalidoException e imprima apenas a mensagem de
            // erro (Sem deixar o programa dar "crash" com letras vermelhas no console).
            System.out.println(e.getMessage());
        }
    }
}
