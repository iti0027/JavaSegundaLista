package Q8.entidades;

public class Livro extends MaterialBiblioteca{

    public Livro(String titulo, int prazoDevolucao) {
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diasAtraso){
        return diasAtraso*1;
    }
}
