package Q3.entidades;

import java.util.List;

public class Empresa {
    private List<Funcionarios> funcionarios;

    public Empresa(List<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public double calcularFolhaDePagamento(){
        double total = 0;
        for (Funcionarios funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }

        return total;
    }

    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }
}