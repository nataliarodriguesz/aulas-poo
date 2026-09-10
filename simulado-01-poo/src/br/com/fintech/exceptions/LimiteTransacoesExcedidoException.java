package br.com.fintech.exceptions;

public class LimiteTransacoesExcedidoException extends Exception {
    public LimiteTransacoesExcedidoException(String mensagem) {
        super(mensagem);
    }
}
