package Q9;

import Q9.entidades.EditorImagem;
import Q9.entidades.ImagemColorida;
import Q9.entidades.ImagemTransparante;

public class Main {
    public static void main(String[] args) {
        ImagemColorida ic = new ImagemColorida(128, 128);
        ImagemTransparante it = new ImagemTransparante(128, 128);

        String info1 = EditorImagem.exibirInformacoes(ic);
        String info2 = EditorImagem.exibirInformacoes(it);

        System.out.println(info1);
        System.out.println(info2);
    }
}