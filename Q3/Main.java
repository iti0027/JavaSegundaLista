package Q3;

import Q3.entidades.Desenvolvedor;
import Q3.entidades.Empresa;
import Q3.entidades.Estagiario;
import Q3.entidades.Funcionarios;
import Q3.entidades.Gerente;
import Q3.execoes.salarioBase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            Desenvolvedor dev = new Desenvolvedor("Ítalo", 5000, 1.5);
            Estagiario estagiario = new Estagiario("Arthur", 1000);

            List<Funcionarios> funcionarios = new ArrayList<>(null);
            funcionarios.add(estagiario);
            funcionarios.add(dev);
            
            Empresa company = new Empresa(funcionarios);
            System.out.println("Folha de pagamento" + company.calcularFolhaDePagamento());
        } catch (salarioBase e){
            System.out.println(e.getMessage());
        }
    }
}