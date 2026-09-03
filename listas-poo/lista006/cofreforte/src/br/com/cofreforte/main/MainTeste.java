package br.com.cofreforte.main;

import br.com.cofreforte.modelo.Agencia;
import br.com.cofreforte.modelo.Cliente;
import br.com.cofreforte.modelo.ContaBancaria;

public class MainTeste {
    public static void main(String[] args) {
        // 1. Instancie dois Clientes diferentes, mas com o MESMO CPF.
        Cliente c1 = new Cliente("123.456.789-00", "Natália", "natalia@gmail.com");
        Cliente c2 = new Cliente("123.456.789-00", "Gustavo", "gustavo@gmail.com");

        // 2. Faça um if testando se eles são iguais usando o metodo correto de POO. Se o
        // console não imprimir que eles são iguais, você falhou na RN02.
        if(c1.equals(c2)){
            System.out.println("Os clientes são iguais");
        } else {
            System.out.println("Os clientes não são iguais");
        }

        // 3. Instancie uma ContaBancaria com saldo de 50.0.
        ContaBancaria conta = new ContaBancaria("123", 50.0, c1);

        // 4. Tente realizar um saque de 50.0. O sistema deve negar (por causa da taxa). Imprima
        // o retorno do metodo (deve ser false).
        System.out.println(conta.sacar(50.0));

        // 5. Imprima o total de contas abertas chamando a classe Agencia.
        System.out.println("Total de contas abertas: " + Agencia.getTotalContasAbertas());
    }
}
