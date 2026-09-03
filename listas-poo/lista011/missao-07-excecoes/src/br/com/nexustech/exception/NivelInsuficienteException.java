package br.com.nexustech.exception;

public class NivelInsuficienteException extends RuntimeException{

    // Exercício 8: Forjando a regra de negócio
    public NivelInsuficienteException() {
        super("Seu nível é muito baixo para esta masmorra!");
    }
}
