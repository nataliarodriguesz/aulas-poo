package br.com.cofreforte.modelo;

public class Agencia {
    public static final String NOME_BANCO = "JavaBank";
    public static final double TAXA_SAQUE = 5.0;
    private static int totalContasAbertas;

    public static int getTotalContasAbertas() {
        return totalContasAbertas;
    }

    public static void registrarNovaConta(){
        totalContasAbertas++;
    }
}
