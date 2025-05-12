package Q8;

import Q8.entidades.Livro;
import Q8.entidades.Revista;
import Q8.entidades.SistemaBiblioteca;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Quem Pensa Enrriquece", 23);
        Revista revista = new Revista("Ford", 4);

        SistemaBiblioteca sisBib = new SistemaBiblioteca();
        String info1 = sisBib.registrarEmprestimo(livro);
        String info2 = sisBib.registrarEmprestimo(revista);

        System.out.println(info1);
        System.out.println(info2);

    }
}
