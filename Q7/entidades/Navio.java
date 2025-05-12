package Q7.entidades;

public class Navio extends Veiculo{

    public Navio(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public String tipoCombustivel() {
        return "Diesel marítmo";
    }
}
