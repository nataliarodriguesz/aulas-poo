package br.com.meusistema.model;

public class Carro {
    public String modelo;
    public String cor;
    public int velocidade;

    public void buzinar() {
        System.out.println("O " + modelo + " " + cor + " fez: BIIII BIIII!");
    }


}