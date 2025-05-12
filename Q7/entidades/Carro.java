package Q7.entidades;

public class Carro extends Veiculo{

    public Carro(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public String tipoCombustivel() {
        return "Gasolina";
    }
}
