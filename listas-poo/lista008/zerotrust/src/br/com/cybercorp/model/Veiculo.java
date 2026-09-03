package br.com.cybercorp.model;

public class Veiculo {
    private String placa;
    private String modelo;
    private Funcionario funcionario;

    public Veiculo(String placa, String modelo, Funcionario funcionario) {
        this.placa = placa;
        this.modelo = modelo;
        this.funcionario = funcionario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Veiculo [ " +
                "Placa: " + placa +
                ", Modelo: " + modelo +
                ", Funcionario: " + funcionario +
                " ]";
    }
}
