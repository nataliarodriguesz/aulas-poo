package br.com.nexustech.model;

import br.com.nexustech.exception.BanidoException;

public class MatchMaker {

    // Exercício 13: O sistema
    public void encontrarSala(ModoJogo modo, boolean jogadorBanido) throws BanidoException {
        if(jogadorBanido) {
            throw new BanidoException();
        } else {
            modo.buscarPartida();
        }
    }
}
