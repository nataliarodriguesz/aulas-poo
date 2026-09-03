package br.com.cybercorp.main;

import br.com.cybercorp.model.*;

public class MainTeste {
    public static void main(String[] args) {
        // 1. Instancie 1 Departamento, 1 Funcionário e 1 Veículo.
        Departamento departamento = new Departamento("ADM", "Administração", 2);
        Funcionario funcionario = new Funcionario("123", "Silvio", departamento);
        Veiculo veiculo = new Veiculo("ABC-1234", "Civic", funcionario);

        // 2. Instancie o SistemaSeguranca com apenas 2 vagas de garagem.
        SistemaSeguranca sistemaSeguranca = new SistemaSeguranca(2);

        // 3. Crie a credencial original: c1 = new Credencial("FFF-999", true, func);
        Credencial c1 = new Credencial("AAA-001", true, funcionario);

        // 4. Crie o CLONE (mesmo código, outro objeto na memória): clone = new Credencial("FFF-999", true, func);
        Credencial clone = new Credencial("AAA-001", true, funcionario);

        // 5. Teste a Catraca: Passe o funcionário duas vezes. O console deve permitir ambos.
        sistemaSeguranca.registrarCatraca(funcionario);
        sistemaSeguranca.registrarCatraca(funcionario);

        // 6. Teste o Cofre: Tente passar a c1 e depois a credencial clone. O seu HashSet deve bloquear o clone e
        // disparar o "ALERTA MÁXIMO".
        sistemaSeguranca.acessarCofre(c1);
        sistemaSeguranca.acessarCofre(clone);

        // 7. Teste a Garagem: Estacione o carro na vaga 0. Depois, force um erro tentando estacionar na vaga 5. O
        // sistema deve "capotar" com o erro vermelho ArrayIndexOutOfBoundsException, provando a rigidez dos Arrays
        // abordada em aula.
        sistemaSeguranca.estacionarVeiculo(veiculo, 0);
        sistemaSeguranca.estacionarVeiculo(veiculo, 5);
    }
}
