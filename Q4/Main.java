package Q4;

import Q4.entidades.Computador;
import Q4.entidades.Loja;
import Q4.entidades.Produto;
import Q4.entidades.Tablet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computador comp = new Computador("Notbook Dell", 1500);
        Tablet tablet = new Tablet("Tablet Lenovo", 1000);

        List<Produto> lista = new ArrayList<>();
        lista.add(comp);
        lista.add(tablet);

        Loja loja = new Loja(lista);
        loja.listarGarantias();
    }
}