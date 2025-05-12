package Q5;

import Q5.entidades.Banco;
import Q5.entidades.ContaCorrente;
import Q5.entidades.ContaSalario;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("Ítalo", 2700);
        ContaSalario cs = new ContaSalario("João",1500);

        banco.adicionarConta(cc);
        banco.adicionarConta(cs);

        banco.gerarRelatorio();
    }
}