package Q10;

import Q10.entidades.Desenvolvedor;
import Q10.entidades.Designer;
import Q10.entidades.GestorProjeto;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Carlos", "Darcy");
        Designer designer = new Designer("Pedro", "Darcy");

        String relatorio1 = GestorProjeto.exibirRelatorio(designer);
        String relatorio2 = GestorProjeto.exibirRelatorio(dev);

        System.out.println(relatorio1);
        System.out.println(relatorio2);
    }
}
