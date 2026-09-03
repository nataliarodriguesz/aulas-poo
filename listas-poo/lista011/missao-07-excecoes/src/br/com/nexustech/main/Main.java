package br.com.nexustech.main;

import br.com.nexustech.exception.BanidoException;
import br.com.nexustech.exception.NivelInsuficienteException;
import br.com.nexustech.model.Masmorra;
import br.com.nexustech.model.MatchMaker;
import br.com.nexustech.model.ModoCasual;
import br.com.nexustech.model.ModoRanqueado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Exercício 1: O Bug do K/D (Divisão por Zero)
        int kills = 15;
        int deaths = 0;

        // Exercício 2: Consertando o K/D
        try {
            System.out.println(kills/deaths);
        } catch (ArithmeticException e) {
            System.out.println("Taxa K/D: Jogador Invicto!");
        }

        // Exercício 3: O inventário bugado
        List<String> inventario = new ArrayList<>(3);
        try {
            inventario.add(5, "Espada");
        } catch(IndexOutOfBoundsException e){
            System.out.println("Inventário cheio!");
        }

        // Exercício 4: O Fantasma (O mito NullPointer)
        String jogador = null;
        if(jogador == null){
            System.out.println("Jogador desconectado!");
        } else {
            System.out.println(jogador);
        }

        // Exercício 6: A assinatura do contrato
        try {
            conectarServidor();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Exercício 7: O zelador (Fechando as portas)
        finally {
            System.out.println("Fechando portas de rede do jogo...");
        }

        // Exercício 9: A masmorra Fechada
        Masmorra masmorra = new Masmorra();
        try {
            masmorra.entrar(20);
        } catch (NivelInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        // Exercício 14: A batalha final
        MatchMaker matchMaker = new MatchMaker();
        ModoCasual modoCasual = new ModoCasual();
        ModoRanqueado modoRanqueado = new ModoRanqueado();

        try {
            matchMaker.encontrarSala(modoCasual, true);
        } catch (BanidoException e) {
            System.out.println(e.getMessage());
        }
    }

    // Exercício 5: Simulando a queda de internet
    public static void conectarServidor() throws Exception{
        throw new Exception("Servidor caiu!");
    }
}
