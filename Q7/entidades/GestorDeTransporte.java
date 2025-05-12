package Q7.entidades;

public class GestorDeTransporte {
    public static String calcularViagem(Veiculo veiculo, double distancia){
        return "TEMPO DE VIAGEM: " + veiculo.calcularTempo(distancia) + ", TIPO DE COMBUSTÍVEL: " + veiculo.tipoCombustivel();
    }
}
