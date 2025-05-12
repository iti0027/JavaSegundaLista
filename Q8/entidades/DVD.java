package Q8.entidades;

public class DVD extends MaterialBiblioteca {
    public DVD(String titulo, int prazoDevolucao){
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diaAtrasado){
    return 5;
    }
}
