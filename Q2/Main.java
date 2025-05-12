package Q2;

import Q2.entidades.Carro;
import Q2.entidades.Motocicleta;
import Q2.execoes.YearLessThanZero;
public class Main {
    public static void main(String[] args) {
        try{
            Carro carro = new Carro("Fiat", "Uno", 2005, 4);
            Motocicleta motocicleta = new Motocicleta("Honda", "BMX", 2008, "Marcha");

            carro.informacoes();
            motocicleta.informacoes();
        } catch(YearLessThanZero e){
            System.out.println(e.getMessage());
        }
    }
}