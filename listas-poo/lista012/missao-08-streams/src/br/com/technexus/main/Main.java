package br.com.technexus.main;

import br.com.technexus.model.Loja;
import br.com.technexus.model.Produto;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        // Instanciando produtos categoria GAMES
        Produto p1 = new Produto("The Witcher", "GAMES", 150);
        Produto p2 = new Produto("FIFA", "GAMES", 200);

        // Instanciando produtos categoria LIVROS
        Produto p3 = new Produto("Java for Dummies", "LIVROS", 100);
        Produto p4 = new Produto("Clean Code", "LIVROS", 80);

        // Instanciando produtos categoria HARDWARE
        Produto p5 = new Produto("Mouse", "HARDWARE", 50);

        // Cadastrando os produtos
        loja.cadastrar(p1);
        loja.cadastrar(p2);
        loja.cadastrar(p3);
        loja.cadastrar(p4);
        loja.cadastrar(p5);

        System.out.println("GAMES: " + loja.buscarPorCategoria("GAMES"));
        System.out.println("Patrimônio total: R$" + loja.calcularPatrimonioTotal());
        System.out.println("Total da categoria LIVROS: R$" + loja.calcularTotalPorCategoria("LIVROS"));
    }
}
